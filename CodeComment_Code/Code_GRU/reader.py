import tensorflow as tf
import numpy as np
from copy import deepcopy

import test

max_children_size = 100000

def gen_body_array(repo_name):

    directory = '/home/yuding/workspace/RepoComment/CommentRNN/gen_vector/repo_%s'%repo_name
    #directory = '/home/yuding/workspace/BodySeq2Seq/data/repo_%s'%repo_name
    
    wordToIndex, indexToWord = _read_comments_word('./buildData/body_words/repo_%s/bodyWordMap.txt'%repo_name)
    methodBodies, max_length = _read_comments(directory+'/methodBodyMap.txt',wordToIndex)

    comment_index = np.load('/home/yuding/workspace/RepoComment/CommentRNN/gen_vector/method_vector/methods_%s_indexes.npy'%repo_name)
    #comment_index = np.load('/home/yuding/workspace/RepoComment/CommentRNNCallGraph/comment_%s_data/comment_index.npy'%repo_name)

    bodies = []

    _max_length = 100

    for index in comment_index:
	body_words = methodBodies['%d'%index]
	new_bodies = []
	for i in range(_max_length):
	    if i < len(body_words):
		new_bodies.append(int(body_words[i]))
	    else:
		new_bodies.append(-1)
	bodies.append(new_bodies)

    print np.array(bodies).shape
    np.save('./body/body_%s/bodies_array.npy'%repo_name,np.array(bodies))

def save_data(partial_trees,node_type_size,level_width,max_num_sub_tree,num_sub_trees,method_indexes,repo_name):
    tree_narray = np.array(partial_trees)
    np.save('./output_%s/partial_tree.npy'%repo_name,tree_narray)

    num_sub_tree = np.array(num_sub_trees)
    np.save('./output_%s/num_sub_trees.npy'%repo_name,num_sub_tree)

    np.save('./output_%s/method_indexes.npy'%repo_name,np.array(method_indexes))

    data_file = open('./output_%s/tree_data.txt'%repo_name,'w')
    try:
        data_file.write('%d\n'%node_type_size)
        data_file.write('%d\n'%level_width)
        data_file.write('%d\n'%max_num_sub_tree)
    finally:
        data_file.close()

def load_data(repo_name):
    partial_trees = np.load('./output_%s/partial_tree.npy'%repo_name)
    num_sub_trees = np.load('./output_%s/num_sub_trees.npy'%repo_name)
    method_indexes = np.load('./output_%s/method_indexes.npy'%repo_name)

    data_file = open('./output_%s/tree_data.txt'%repo_name,'r')
    data_lines = data_file.readlines()
    node_type_size = int(data_lines[0].strip())
    level_width = int(data_lines[1].strip())
    max_num_sub_tree = int(data_lines[2].strip())

    return partial_trees,node_type_size,level_width,max_num_sub_tree,num_sub_trees,method_indexes

def _read_lines(fileName):
    if not tf.gfile.Exists(fileName):
        tf.logging.fatal('File does not exist %s', fileName)
    '''
    read all content of the file at once f.read()
    read lines : f.readlines()
    '''
    with tf.gfile.GFile(fileName,'r') as f:
        return f.readlines()

def _read_parse_tree(fileName,repo_name,wether_comment=0):
    parseTree = {}
    maxLength = 0
    maxLevel = 0
    maxWidth = 0
    count = 0
    methodIndex = 0
    node = []
    lines = _read_lines(fileName)
    widthCount = 0

    vocabulary,index2vocab =_read_identifier('./output_%s/vocabularyOriginalMap.txt'%repo_name)
    repo_vocabulary,repo_index2vocab =_read_identifier('./output_%s/vocabularyMap.txt'%repo_name)
    print len(vocabulary),len(index2vocab)
    print len(repo_vocabulary),len(repo_index2vocab)

    inter_type,index2type = _read_inter_type('./output_%s/interOriginalMap.txt'%repo_name)
    repo_inter_type,repo_index2type = _read_inter_type('./output_%s/interMap.txt'%repo_name)
    print len(inter_type),len(index2type)
    print len(repo_inter_type),len(repo_index2type)

    if wether_comment == 1:
        wordToIndex, indexToWord = _read_comments_word('output_%s/commentWordMap.txt'%repo_name)
        methodComments,maxLength = _read_comments('output_%s/methodCommentMap.txt'%repo_name,wordToIndex)
    for i in range (1,len(lines)):
        if lines[i][0] == '#':
            if i > 1:
                if maxLength < len(node):
                    maxLength = len(node)
                if wether_comment == 1:
                    if methodComments.has_key(('%d'%methodIndex)):
                        parseTree[methodIndex] = node
                else:
                    parseTree[methodIndex] = node
                if (widthCount > maxWidth):
                    maxWidth = widthCount
                widthCount = 0
            methodIndex = int(lines[i].replace('\n','')[1:])
            node = []
        else:
            nums = lines[i].replace('\n','').split(' ')
            newNums = []
	    nums_index = 0
            for num in nums:
		num_ = int(num)
		if nums_index == 2:
		    if num_ > 0:
			if int(nums[3]) > 0:
			    if inter_type.has_key(repo_index2type[num_]):
				num_ = inter_type[repo_index2type[num_]]
			    else:
				num_ = -len(vocabulary)
			else:
			    if vocabulary.has_key(repo_index2vocab[num_]):
				num_ = vocabulary[repo_index2vocab[num_]]
			    else:
				num_ = 0
		nums_index += 1
                newNums.append(num_)

            if (newNums[3] == 0):
                widthCount += 1
            if newNums[4] > maxLevel:
                maxLevel = newNums[4]
            node.append(newNums)

    if wether_comment == 1:
        if methodIndex in methodComments:
            parseTree[methodIndex] = node
    else:
        parseTree[methodIndex] = node

    return parseTree,maxLength,maxLevel,maxWidth

def _read_inter_type(fileName):
    inter_type = {}
    index_to_inter_type = {}
    lines = _read_lines(fileName)
    for i in range(0,len(lines)):
        line = lines[i].replace(' ','').replace('\n','').split(',')
        inter_type[line[1]] = int(line[0])
	index_to_inter_type[int(line[0])] = line[1]

    return inter_type,index_to_inter_type

def _read_identifier(fileName):
    vocabulary = {}
    index_to_vocab = {}
    lines = _read_lines(fileName)
    for i in range(0,len(lines)):
        line = lines[i].replace(' ','').split(',')
        vocabulary[line[1]] = int(line[0])
	index_to_vocab[int(line[0])] = line[1]
#	vocabulary[int(line[0])] = line[1]
    return vocabulary,index_to_vocab

def _read_method_map(fileName):
    method_index2name_map = {}
    lines = _read_lines(fileName)
    for i in range(0,len(lines)):
        line = lines[i]
        line = line.replace("\n","").replace(' ','').split(',')
        methodName = line[1].split('.')[-1]
        method_index2name_map[int(line[0])] = methodName

    return method_index2name_map

def split_method_name(methodName):
    names = []
    head_index = 0
    for i in range(len(methodName)):
        if methodName[i] == '_':
            name = methodName[head_index:i]
            if len(name)> 0:
                names.append(name.lower())
            head_index = i+1
        elif methodName[i].isupper():
            if i > 0:
                name = methodName[head_index:i]
                name = name.lower()
                if len(name) > 0:
                    names.append(name)
            head_index = i
    name = methodName[head_index:len(methodName)]
    if len(name) > 0:
        names.append(name.lower())
    return names

def gen_parse_tree_matrix(parseTree,parse_tree_depth,parse_tree_width,call_graph_level,repo_name):


    copy_parse_tree = deepcopy(parseTree)
    expand_parse_tree = {}

    wordToIndex, indexToWord = _read_comments_word('./output_%s/commentWordMap.txt'%repo_name)
    methodComments,maxLength = _read_comments('./output_%s/methodCommentMap.txt'%repo_name,wordToIndex)

    for (methodIndex,tree) in parseTree.items():
        if methodComments.has_key('%d'%methodIndex):
#	if True:
            copy_tree = deepcopy(tree)
            new_tree = expand_call_graph(methodIndex,copy_tree,copy_parse_tree,call_graph_level)
            expand_parse_tree[methodIndex] = new_tree

    print 'expand parse tree',len(expand_parse_tree)

    convert_parse_tree,vocab_size,inter_type_size = convert_method2method_name(expand_parse_tree,repo_name)

    print 'convert parse tree',len(convert_parse_tree)

    print 'vocab size',vocab_size
    print 'inter type size',inter_type_size

    max_partial_tree_len = 0
    partial_tree = {}
    partial_tree_level = {}
    num_sub_trees = {}
    num = 0
    level = 0
    level_max_length = 0
    max_num_sub_tree = 0
    a1 = 0
    a2 = 0
    b = 0
    b1 = 0
    for (methodIndex,node) in convert_parse_tree.items():
        partial_trees,nums,partial_trees_level,length_level = gen_partial_tree(deepcopy(node),parse_tree_depth)
	#print 'length C',len(partial_trees),len(partial_trees_level)
        if level_max_length < length_level:
            level_max_length = length_level
	    a2 = a1
	    a1 = methodIndex

	if max_num_sub_tree < len(partial_trees_level):
            max_num_sub_tree = len(partial_trees_level)
	    b1 = b
	    b = methodIndex

        if len(partial_trees_level) > 0:
            partial_tree[methodIndex] = partial_trees
            partial_tree_level[methodIndex] = partial_trees_level
	    num_sub_trees[methodIndex] = 1 / float(len(partial_trees_level))

        for a in partial_trees:
            if max_partial_tree_len < len(a):
                max_partial_tree_len = len(a)
                num = methodIndex
                level = node[4]

    print 'level max length',level_max_length,a1,a2,'max num sub tree',max_num_sub_tree,b,b1

    #earse
    copy_parse_tree.clear()
    expand_parse_tree.clear()
    convert_parse_tree.clear()
    partial_tree.clear()

    final_partial_trees = []
    final_num_sub_trees = []
    final_method_indexes = []
    fill_index = vocab_size+inter_type_size
    max_num_sub_tree_method = 0
    abc = 0
    
    print 'num of partial tree',len(partial_tree_level)
    #fill none node
    for (methodIndex,trees) in partial_tree_level.items():
	abc += 1
	print '\n%d, %d,%d'%(methodIndex,len(partial_tree_level),abc)
        tmp_trees = []
	len_trees = len(trees)
	for tree_index in range(max_num_sub_tree):
	    if tree_index < len_trees:
	        tree = trees[tree_index]
	    else:
		tree = []
            tmp_tree = [ [ [] for j in range(level_max_length)] for i in range(parse_tree_depth)]
            for i in range(parse_tree_depth):
                for j in range(level_max_length):
		    if len(tree) == 0:
                        tmp_tree[i][j] = [-1,fill_index,1]
                    elif j < len(tree[i]):
			if tree[i][j][3] > 0:
                            tmp_tree[i][j] = [tree[i][j][1],tree[i][j][2],1/float(tree[i][j][3])]
			else:
			    tmp_tree[i][j] = tree[i][j][1:4]
                    else:
                        tmp_tree[i][j] = [-1,fill_index,1]
            tmp_trees.append(tmp_tree)
        final_partial_trees.append(tmp_trees)
	final_num_sub_trees.append(num_sub_trees[methodIndex])
	final_method_indexes.append(methodIndex)
        #final_partial_trees[methodIndex] = tmp_trees
	'''
	if abc % 100 == 0:
	    yield final_partial_trees,final_num_sub_trees,final_method_indexes
	    final_partial_trees = []
	    final_num_sub_trees = []
	    final_method_indexes = []
	'''
    #yield final_partial_trees,final_num_sub_trees,final_method_indexes
    return final_partial_trees,fill_index,level_max_length,max_num_sub_tree,final_num_sub_trees,final_method_indexes

def gen_partial_tree(tree,depth):

    partial_trees = [ [] for i in range(len(tree))]

    depth_num = [ 0 for i in range(len(tree))]

    for node in tree:
        partial_trees[node[0]].append(deepcopy(node))
        depth_num[node[0]] = 1
        father = node[1]
        while True:
            if father == -1 or node[4] - tree[father][4] >= depth:
                break
            partial_trees[father].append(deepcopy(node))
            depth_num[father] = node[4] - tree[father][4] + 1
            father = tree[father][1]

    j = 0
    for i in range(len(depth_num)):
        if depth_num[i] < depth:
            del partial_trees[j]
        else:
            j += 1

    # determine the new level for every partial tree node
    for nodes in partial_trees:
        nodes[0][4] = 0
        nodes[0][1] = -1
        for i in range(len(nodes)):
            index = nodes[i][0]
#            nodes[i][0] = i
            for j in range(i,len(nodes)):
                if nodes[j][1] == index:
#                    nodes[j][1] = i
                    nodes[j][4] = nodes[i][4]+1

    partial_trees_level = []

    #renumber the index
    for nodes in partial_trees:
        level_tree = [ [] for i in range(depth)]
        for i in range(len(nodes)):
            level_tree[nodes[i][4]].append(nodes[i])

        partial_trees_level.append(deepcopy(level_tree))

    level_max_length = 0
    for tree in partial_trees_level:
        for i in range(depth-1):
            if level_max_length < len(tree[i]):
                level_max_length = len(tree[i])
            for j in range(len(tree[i])):
                index = tree[i][j][0]
                tree[i][j][0] = j
                for k in range(len(tree[i+1])):
                    if tree[i+1][k][1] == index:
                        tree[i+1][k][1] = j
        for j in range(len(tree[depth-1])):
            if level_max_length < len(tree[depth-1]):
                level_max_length = len(tree[depth-1])
            tree[depth-1][j][0] = j



    return partial_trees,depth_num,partial_trees_level,level_max_length

def split_inter_node_via_depth(tree,depth):

    result = [ [] for i in range(depth)]

    for node in tree:
        if node[4] > depth:
            print ('Wrong depth')

        result[node[4]].append(node)


    # renumber
    for i in range(len(result)-1):
        for j in range(len(result[i])):
            for node in result[i+1]:
                if node[1] == result[i][j][0]:
                    node[1] = j
            result[i][j][0] = j

    max_width = 0
    for i in range(len(result)):
        if max_width < len(result[i]):
            max_width = len(result[i])

    return result,max_width

def split_tree_to_leaf_inter(parse_tree):
    leaf_node = []
    inter_node = []

    # split
    for node in parse_tree:
        if node[3] == 0:
            leaf_node.append(deepcopy(node))
        else:
            inter_node.append(deepcopy(node))

    # renumber
    for i in range(len(inter_node)):
        if i != inter_node[i][0]:
            for node in leaf_node:
                if node[1] == inter_node[i][0]:
                    node[1] = i
            for j in range(i+1,len(inter_node)):
                if inter_node[j][1] == inter_node[i][0]:
                    inter_node[j][1] = i
            inter_node[i][0] = i

    return leaf_node,inter_node

def convert_method2method_name(parse_trees,repo_name):

    new_tree = deepcopy(parse_trees)

    vocabulary,index2vocab =_read_identifier('./output_%s/vocabularyOriginalMap.txt'%repo_name)
    inter_type,index2type = _read_inter_type('./output_%s/interOriginalMap.txt'%repo_name)
    method_index2name_map = _read_method_map('./output_%s/methodMap.txt'%repo_name)

    vocab_size = len(vocabulary)
    inter_type_size = len(inter_type)

    for (methodIndex, tree) in new_tree.items():
        for node in tree:
            if node[3] > max_children_size:
		del new_tree[methodIndex]
		break
            if node[3] > 0:
                node[2] += vocab_size
            if node[2] < 0:
                name_index = -node[2]
                new_names = split_method_name(method_index2name_map[name_index])
                node_index = len(tree)
                node[3] = len(new_names)
                node[2] = inter_type['CombineName']
                for i in range(len(new_names)):
                    #if vocabulary.has_key(new_names[i]):
                    if new_names[i] in vocabulary:
                        tree.append([node_index+i,node[0],vocabulary[new_names[i]],0,node[4]+1])
                    else:
                        tree.append([node_index+i,
				    node[0],
				    vocabulary['UNK'],
				    0,
				    node[4]+1])

    return new_tree,len(vocabulary),len(inter_type)

def expand_call_graph(methodIndex,parse_tree,all_trees,call_graph_level):

    new_tree = deepcopy(parse_tree)

    if call_graph_level == 0:
        return new_tree

    len_parse_tree = len(new_tree)
    count_call_level = 1
    node_index = 0
    while node_index < len_parse_tree:
        node = new_tree[node_index]
        if node[2] < 0:
            call_method = all_trees.get(-node[2])
            node[2] = call_method[0][2]
            node[3] = call_method[0][3]
            new_len_parse_tree = len(new_tree)
            for call_method_node_index in range(1,len(call_method)):
                new_tree.append(deepcopy(call_method[call_method_node_index]))
                size = len(new_tree)
                new_tree[size-1][0] += new_len_parse_tree-1
                if new_tree[size-1][1] == 0:
                    new_tree[size-1][1] = node[0]
                else:
                    new_tree[size-1][1] += new_len_parse_tree-1
                new_tree[size-1][4] += node[4]

        if (node_index == len_parse_tree-1 and count_call_level < call_graph_level):
            print count_call_level
            len_parse_tree = len(new_tree)
            count_call_level += 1
        node_index += 1
    return new_tree

def truncate_tree_depth(parse_tree,depth):

    for i in range(len(parse_tree)-1,-1,-1):
        if parse_tree[i][4] > depth and parse_tree[i][3] != -1:
            father = parse_tree[i][1]
            while parse_tree[father][4] > depth-1:
                parse_tree[father][3] = -1
                father = parse_tree[father][1]
            parse_tree[i][1] = father
            parse_tree[i][4] = depth

    # delete some internal nodes
    i = 0
    while i < len(parse_tree):
        if parse_tree[i][3] == -1:
            del parse_tree[i]
        else:
            i += 1
    
    # renumber the node
    for j in range(len(parse_tree)):
        if j != parse_tree[j][0]:
            index = j
            while index < len(parse_tree):
                if parse_tree[index][1] == parse_tree[j][0]:
                    parse_tree[index][1] = j
                index += 1
            parse_tree[j][0] = j
    
    return len(parse_tree)

def _read_comments_word(fileName):
    wordToIndex = {}
    indexToWord = {}
    for line in _read_lines(fileName):
        line = line.replace(' ', '').replace('\n','')
        word =  line.split(',')
        wordToIndex[word[1]] = word[0]
        indexToWord[word[0]] = word[1]
    return wordToIndex, indexToWord

def _read_comments(fileName, wordToIndex):
        methodComments = {}
        maxLength = 0
	lengths = []
        for line in _read_lines(fileName):
            line = line.replace('\n','');
            words = line.split(',')
            methodIndex = words[0].replace(' ' , '')
            commentWords = [wordToIndex['START']]
            for word in words[1].split(' '):
                if word != ' ' and word != '\n' and word != '' and word.find('\n') == -1:
                    #if wordToIndex.has_key(word):
                    if word in wordToIndex:
                        commentWords.append(wordToIndex[word])
                    else:
                        commentWords.append(wordToIndex['UNK'])
            commentWords.append(wordToIndex['</s>'])
            methodComments[methodIndex] = commentWords
            length = len(commentWords)
	    lengths.append(length)
            if length > maxLength:
                maxLength = length

	lengths = np.array(lengths)
	index = np.argsort(lengths)
	print lengths[index]
	print lengths[len(index)/2]
        return methodComments,maxLength

def gen_data():
    abc = 1

def gen_batch(batch_size,partial_trees,num_sub_trees):
    '''
    for (methodIndex,partial_tree_set) in partial_trees.items():
        for partial_tree in partial_tree_set:
            trees.append(partial_tree)
            method_index.append(count)
    '''
    index_array = [i for i in range(len(partial_trees))]
#    index_array = np.random.permutation(index_array)
#    print index_array

    print len(partial_trees),len(partial_trees[0]),len(partial_trees[0][0]),len(partial_trees[0][0][0])

    num_batch = len(partial_trees) // batch_size

    print 'batch count',num_batch,len(partial_trees)

    for i in range(num_batch):
        data_tree = partial_trees[index_array[i*batch_size : (i+1)*batch_size]][:,:,:,:,0:2]
        data_tree_1 = partial_trees[index_array[i*batch_size : (i+1)*batch_size]][:,:,:,:,2]
	data_tree_num_sub_trees = num_sub_trees[index_array[i*batch_size : (i+1)*batch_size]]

#	tree_label = which_cluster[index_array[i*batch_size : (i+1)*batch_size]]
        yield data_tree,data_tree_1,data_tree_num_sub_trees
    

def gen_epochs(n,batch_size,partial_trees,num_sub_trees,wether_train,cross_validation_index):
#    wordToIndex, indexToWord = _read_comments_word('data/commentWordMap.txt')
#    methodComments,maxLength = _read_comments('data/methodCommentMap.txt',wordToIndex)

#    print input_trees.shape,input_num_sub_trees.shape,input_which_cluster.shape,type(input_trees),type(input_num_sub_trees),type(input_which_cluster)
    input_trees = partial_trees
    input_num_sub_trees = num_sub_trees

    for i in range(n):
        yield gen_batch(batch_size,input_trees,input_num_sub_trees)
        #yield gen_batch(methodComments,batch_size,indexToWord,maxLength,partial_trees)

def gen_comment_batch(batch_size,num_steps,method_vectors,method_comments,bodies_array):

    data_size = len(method_vectors)
    iters = data_size // batch_size

    comment_length = len(method_comments[0])
    num_step_length = comment_length // num_steps

    print 'gen data',data_size,iters,comment_length,num_step_length

    for i in range(iters):
	#for j in range(comment_length-num_steps+1):
	flag = -1
	for j in range(num_step_length-1):
	    '''
	    yield_vectors = np.array([method_vectors[i*batch_size:(i+1)*batch_size] for m in range(num_steps)])
	    slides the comment and the method vector is the input of RNN
	    yield yield_vectors,method_comments[i*batch_size:(i+1)*batch_size,j:j+num_steps]
	    '''

	    '''
	    slides the block of comments and the method vector is the input of RNN
	    yield yield_vectors,method_comments[i*batch_size:(i+1)*batch_size,j*num_steps:(j+1)*num_steps]
	    '''

	    '''
	    the input of RNN is the one hot vector of comment
	    '''
	    if flag == -1:
		flag = 0
	    else:
		flag = 1

	    yield method_vectors[i*batch_size:(i+1)*batch_size],method_comments[i*batch_size:(i+1)*batch_size,j*num_steps:(j+1)*num_steps],method_comments[i*batch_size:(i+1)*batch_size,j*num_steps+1:(j+1)*num_steps+1],bodies_array[i*batch_size:(i+1)*batch_size],flag
	    

def gen_comment_epoch(n,batch_size,num_steps,method_vectors,method_comments,bodies_array):

    for i in range(n):
#    while True:
	yield gen_comment_batch(batch_size,num_steps,method_vectors,method_comments,bodies_array)

def gen_eval_batch(batch_size,num_steps,method_vectors,method_comments,i):

    data_size = len(method_vectors)
    iters = data_size // batch_size

    comment_length = len(method_comments[0])
    num_step_length = comment_length // num_steps

#    for i in range(iters):
	#yield [method_vectors[i*batch_size:(i+1)*batch_size]]
    for j in range(num_step_length):
        yield method_vectors[i*batch_size:(i+1)*batch_size],method_comments[i*batch_size:(i+1)*batch_size,j*num_steps:(j+1)*num_steps],method_comments[i*batch_size:(i+1)*batch_size,j*num_steps+1:(j+1)*num_steps+1]

def gen_eval_epoch(n,batch_size,num_steps,method_vectors,method_comments,bodies_array):

    for i in range(n):
#    while True:
	#yield gen_eval_batch(batch_size,num_steps,method_vectors,method_comments,i)
	yield method_vectors[i*batch_size:(i+1)*batch_size],bodies_array[i*batch_size:(i+1)*batch_size]

if __name__ == '__main__':

    '''
    parseTree, maxLength, parse_tree_depth1, parse_tree_width = _read_parse_tree('repo_data/parseTree.txt')
    print ('maximum number of nodes',maxLength)
    print ('max depth of trees',parse_tree_depth1)
    print ('max num of leaf nodes',parse_tree_width)
    print 'num of parse trees', len(parseTree)

    print parseTree

    partial_trees,node_type_size,level_width,max_num_sub_tree,num_sub_trees,method_indexes = gen_parse_tree_matrix(parseTree,5,parse_tree_width,1)
    '''

    gen_body_array('Smack')
