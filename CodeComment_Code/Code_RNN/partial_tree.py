import tensorflow as tf
import numpy as np
from copy import deepcopy

import test
import train

max_children_size = 100000

def _read_lines(fileName):
    if not tf.gfile.Exists(fileName):
        tf.logging.fatal('File does not exist %s', fileName)
    '''
    read all content of the file at once f.read()
    read lines : f.readlines()
    '''
    with tf.gfile.GFile(fileName,'r') as f:
        return f.readlines()

def _read_parse_tree(fileName,wether_comment=0):
    parseTree = {}
    maxLength = 0
    maxLevel = 0
    maxWidth = 0
    count = 0
    methodIndex = 0
    node = []
    lines = _read_lines(fileName)
    widthCount = 0

    if wether_comment == 1:
        wordToIndex, indexToWord = _read_comments_word('data/commentWordMap.txt')
        methodComments,maxLength = _read_comments('data/methodCommentMap.txt',wordToIndex)

    judge = False
    depth_count = 0
    for i in range (1,len(lines)):
        if lines[i][0] == '#':
	    judge = True
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
            for num in nums:
                newNums.append(int(num))

            if (newNums[3] == 0):
                widthCount += 1
            if newNums[4] > maxLevel:
                maxLevel = newNums[4]
 	    if newNums[4] > 80 and judge:
		depth_count += 1
		judge = False
            node.append(newNums)

    #print 'depth count',depth_count

    if wether_comment == 1:
        if methodIndex in methodComments:
            parseTree[methodIndex] = node
    else:
        parseTree[methodIndex] = node

    return parseTree,maxLength,maxLevel+1,maxWidth

def _read_inter_type(fileName):
    inter_type = {}
    lines = _read_lines(fileName)
    for i in range(0,len(lines)):
        line = lines[i].replace(' ','').replace('\n','').split(',')
        inter_type[line[1]] = int(line[0])

    return inter_type

def _read_identifier(fileName):
    vocabulary = {}
    lines = _read_lines(fileName)
    for i in range(0,len(lines)):
        line = lines[i].split(',')
        vocabulary[line[1]] = int(line[0])
#	vocabulary[int(line[0])] = line[1]
    return vocabulary

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

def gen_parse_tree_matrix(parseTree,parse_tree_depth,parse_tree_width,call_graph_level):


    copy_parse_tree = deepcopy(parseTree)
    expand_parse_tree = {}

    for (methodIndex,tree) in parseTree.items():
#        if methodComments.has_key('%d'%methodIndex):
	if True:
            copy_tree = deepcopy(tree)
            new_tree = expand_call_graph(methodIndex,copy_tree,copy_parse_tree,call_graph_level)
            expand_parse_tree[methodIndex] = new_tree

    print 'expand parse tree',len(expand_parse_tree)

    convert_parse_tree,vocab_size,inter_type_size = convert_method2method_name(expand_parse_tree)

    print 'convert parse tree',len(convert_parse_tree)

    print 'vocab size',vocab_size
    print 'inter type size',inter_type_size

    _tree_level = {}
    level_max_length = 0
    #print 'ABCDEFG', len(convert_parse_tree),len(convert_parse_tree[2])
    #print convert_parse_tree[2]
    level_count = 0
    for (methodIndex,node) in convert_parse_tree.items():
        convert_level_tree,length_level = gen_level_tree(deepcopy(node),parse_tree_depth)
	_tree_level[methodIndex] = convert_level_tree

	judge = True
	for level_nodes in convert_level_tree:
	    if level_max_length < len(level_nodes):
		level_max_length = len(level_nodes)
	    if judge:
		if len(level_nodes) > 300:
		    print 'method index',methodIndex
		    level_count += 1
		    judge = False

    print 'level max length', level_max_length,level_count

    #earse
    copy_parse_tree.clear()
    expand_parse_tree.clear()
    convert_parse_tree.clear()

    final_tree_level = []
    final_method_indexes = []
    fill_index = vocab_size + inter_type_size
    #'''
    for (method_index,tree_) in _tree_level.items():

        tmp_tree = [ [ [] for j in range(level_max_length)] for i in range(parse_tree_depth)]
	for i in range(parse_tree_depth):
	    for j in range(level_max_length):
		if j < len(tree_[i]):
		    if tree_[i][j][3] > 0:
		        tmp_tree[i][j] = [tree_[i][j][1],tree_[i][j][2],1 / float(tree_[i][j][3])]
		    else:
			tmp_tree[i][j] = tree_[i][j][1:4]
		else:
		    tmp_tree[i][j] = [-1, fill_index, 1]
	final_tree_level.append(tmp_tree)
	final_method_indexes.append(method_index)
	if method_index % 100 == 0:
	    print method_index
#    	    yield final_tree_level,fill_index,level_max_length,final_method_indexes
#	    final_tree_level = []
#	    final_method_indexes = []

#    yield final_tree_level,fill_index,level_max_length,final_method_indexes
    #'''
#    print "FINAL",np.array(final_tree_level[0]).shape
    return final_tree_level,fill_index,level_max_length,final_method_indexes

def gen_level_tree(tree,depth):

    level_tree = [[] for i in range(depth)]


    partial_trees_level = []

    #renumber the index
    for i in range(len(tree)):
        level_tree[tree[i][4]].append(tree[i])

    level_max_length = 0
    if True:
        for i in range(depth-1):
            if level_max_length < len(level_tree[i]):
                level_max_length = len(level_tree[i])
            for j in range(len(level_tree[i])):
                index = level_tree[i][j][0]
                level_tree[i][j][0] = j
                for k in range(len(level_tree[i+1])):
                    if level_tree[i+1][k][1] == index:
                        level_tree[i+1][k][1] = j
        for j in range(len(level_tree[depth-1])):
            if level_max_length < len(level_tree[depth-1]):
                level_max_length = len(level_tree[depth-1])
            level_tree[depth-1][j][0] = j



    return level_tree,level_max_length

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

def convert_method2method_name(parse_trees):

    new_tree = deepcopy(parse_trees)

    vocabulary =_read_identifier('./data/vocabularyMap.txt')
    inter_type = _read_inter_type('./data/interMap.txt')
    method_index2name_map = _read_method_map('./data/methodMap.txt')

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
                        tree.append([node_index+i,node[0],vocabulary['UNK'],0,node[4]+1])

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
        for line in _read_lines(fileName):
            line = line.replace('\n','');
            words = line.split(',')
            methodIndex = words[0].replace(' ' , '')
            commentWords = []
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
            if length > maxLength:
                maxLength = length
        return methodComments,maxLength

def gen_data():
    abc = 1

def gen_batch(batch_size,partial_trees,which_cluster):
    '''
    for (methodIndex,partial_tree_set) in partial_trees.items():
        for partial_tree in partial_tree_set:
            trees.append(partial_tree)
            method_index.append(count)
    '''
    index_array = [i for i in range(len(partial_trees))]
#    index_array = np.random.permutation(index_array)
#    print index_array

#    print len(partial_trees),len(partial_trees[0]),len(partial_trees[0][0]),len(partial_trees[0][0][0])

    num_batch = len(partial_trees) // batch_size

#    print 'batch count',num_batch,len(partial_trees)

    for i in range(num_batch):
        data_tree = partial_trees[index_array[i*batch_size : (i+1)*batch_size]][:,:,:,0:2]
        data_tree_1 = partial_trees[index_array[i*batch_size : (i+1)*batch_size]][:,:,:,2]

	tree_label = which_cluster[index_array[i*batch_size : (i+1)*batch_size]]
        yield data_tree,data_tree_1,tree_label
    

def gen_raw_method_cluster(file_name,method_nums):

    class_names = {}
    clusters = [[] for i in range(300)]
    which_clusters = [ -1 for i in range(method_nums)]
    index_to_name = []
    name_to_index = {}
    lines = _read_lines(file_name)

    count = 0
    for line in lines:
        name = line.split(',')[1].split('.')[1]
        method_index = int(line.split(',')[0].strip())

        if class_names.has_key(name):
            class_names[name].append(method_index-1)
            clusters[name_to_index[name]].append(method_index-1)
            which_clusters[method_index-1] = name_to_index[name]
        else:
            class_names[name] = [method_index-1]
            index_to_name.append(name)
            name_to_index[name] = count
            clusters[name_to_index[name]].append(method_index-1)
            which_clusters[method_index-1] = name_to_index[name]
            count += 1


    '''
    print "cluster data train"
    print name_to_index
    print class_names
    print index_to_name
    print clusters
    print which_clusters
    '''

    abcdeft = {}
#    print len(class_names)
    for (a,b) in class_names.items():
	abcdeft[a] = len(b)

#    print abcdeft

#    print len(abcdeft)

    __abc__ = [ v for v in sorted(abcdeft.values())] 

    items=abcdeft.items() 
    backitems=[[v[1],v[0]] for v in items] 
    backitems.sort() 
    __defg__ =  [ backitems[i][1] for i in range(0,len(backitems))] 

    print len(__abc__),len(__defg__)
    for i in range(len(__abc__)):
	if __abc__[i] > 100:
	    print __defg__[i],__abc__[i]


    return which_clusters,name_to_index

def _read_cluster(file_name):

    cluster = {}
    lines = _read_lines(file_name)
    for line in lines:
	_line = line.strip().split(',')
	print _line
	cluster[_line[0]] = int(_line[1])

    return cluster

def gen_test_method_cluster(file_name,method_nums):

    clusters = _read_cluster('./data/cluster.txt')
    which_clusters = [ -1 for i in range(method_nums)]
    lines = _read_lines(file_name)

    for line in lines:
        name = line.split(',')[1].split('.')[1]
        method_index = int(line.split(',')[0].strip())

        if clusters.has_key(name):
            which_clusters[method_index-1] = clusters[name]
        else:
            which_clusters[method_index-1] = 0

    '''
    print 'cluster data:'
    print clusters
    print which_clusters
    '''


    return which_clusters


def gen_epochs(n,batch_size,partial_trees,wether_train,cross_validation_index,num_methods):
#    wordToIndex, indexToWord = _read_comments_word('data/commentWordMap.txt')
#    methodComments,maxLength = _read_comments('data/methodCommentMap.txt',wordToIndex)

    print 'NUM', num_methods

    if wether_train == 0:
        which_cluster, cluster_name_to_index  = gen_raw_method_cluster('./data/methodMap.txt',num_methods)
	which_cluster = np.array(which_cluster)
    elif wether_train == 2:
        which_cluster = np.array(gen_test_method_cluster('./test_data/methodMap.txt',num_methods))
    elif wether_train == 3:
        which_cluster = np.array(gen_test_method_cluster('./comment_data/methodMap.txt',num_methods))

    a0 = np.where(which_cluster == 0)[0]
    a1 = np.where(which_cluster == 1)[0]
    a2 = np.where(which_cluster == 2)[0]
    a3 = np.where(which_cluster == 3)[0]
    a4 = np.where(which_cluster == 4)[0]
    a5 = np.where(which_cluster == 5)[0]
    #a6 = np.where(which_cluster == 6)[0]
    #a7 = np.where(which_cluster == 7)[0]
    #a8 = np.where(which_cluster == 8)[0]
    #a9 = np.where(which_cluster == 9)[0]

    print a0.shape,a1.shape,a2.shape,a3.shape,a4.shape,a5.shape,len(a5)
    c = a0[0]

    index = 0
    method_count = 0
    while True:
        if index < len(a0):
            c = np.append(c,a0[index])
            method_count += 1
            if method_count >= num_methods:
                break

        if index < len(a1):
            c = np.append(c,a1[index])
            method_count += 1
            if method_count >= num_methods:
                break

        if index < len(a2):
            c = np.append(c,a2[index])
            method_count += 1
            if method_count >= num_methods:
                break

        if index < len(a3):
            c = np.append(c,a3[index])
            method_count += 1
            if method_count >= num_methods:
                break

        if index < len(a4):
            c = np.append(c,a4[index])
            method_count += 1
            if method_count >= num_methods:
                break

        if index < len(a5):
            c = np.append(c,a5[index])
            method_count += 1
            if method_count >= num_methods:
                break

	index += 1

    partial_trees = partial_trees[c[1:]]
    which_cluster = which_cluster[c[1:]]

    input_trees = partial_trees
    input_which_cluster = which_cluster
    for i in range(n):
        yield gen_batch(batch_size,input_trees,np.array(input_which_cluster))
        #yield gen_batch(methodComments,batch_size,indexToWord,maxLength,partial_trees)


