import numpy as np
import tensorflow as tf
import random
import math

import assignLabel
import calF1
import model
import train
import partial_tree

from CustomRNNCell import CustomRNNCell

batch_size = 1
state_size = 4
learning_rate = 1
num_classes = 6

### method
call_graph_level = 1
vector_size = 50

def reset_graph():
#    if 'sess' in globals() and sess:
#        sess.close()
    tf.reset_default_graph()

def build_graph(batch_size, state_size, learning_rate, node_type_size,vector_size,level_max_width,parse_tree_depth):

    reset_graph()

    '''
    Placeholders
    '''

    x = tf.placeholder(tf.int32,[batch_size,parse_tree_depth,level_max_width,2], name = 'input_holder')
#    x = tf.placeholder(tf.int32,[num_steps,batch_size, num_leaf_node,3], name = 'input_holder')
    x_1 = tf.placeholder(tf.float32,[batch_size,parse_tree_depth,level_max_width], name = 'input_holder')
    print 'shape of input',x.get_shape()

    y = tf.placeholder(tf.int32,[batch_size], name = 'target_holder')

    with tf.variable_scope('TreeRnn'):
        '''
	shape: node_type_size X vector_size X vector_size since there is a matrix for every internal node
        '''
#        W_node = tf.get_variable('W_node',[node_type_size,vector_size],initializer=tf.random_uniform_initializer(minval=-1.0,maxval=1.0,seed=random.seed()))
        W_node = tf.get_variable('W_node',[node_type_size,vector_size],initializer=tf.random_normal_initializer(mean=0.0,stddev=1.0,seed=random.seed()))

        '''
	weight of parent node and children node
        '''
#        W_child = tf.get_variable('W_child',[vector_size,vector_size],initializer=tf.random_uniform_initializer(minval=0.0,maxval=1.0,seed=random.seed()))
        W_child = tf.get_variable('W_child',[vector_size,vector_size],initializer=tf.random_normal_initializer(mean=0.0,stddev=1.0,seed=random.seed()))

	'''
        bias of parent node and children node
        '''
        b_child = tf.get_variable('b_child',[vector_size],initializer=tf.random_normal_initializer(mean=0.0,stddev=0.1,seed=random.seed()))

    cell = CustomRNNCell(state_size,node_type_size,vector_size,batch_size,parse_tree_depth,level_max_width,W_node,W_child,b_child)

    train_trees = cell.__call__(x,x_1)
    print 'train trees',train_trees.get_shape()

    _node_rep,_abc_ = cell.get_node_rep()
    final_tree_vector = cell.get_final_tree_vector()

    with tf.variable_scope('softmax'):
        W = tf.get_variable('W', [vector_size, num_classes])
        b = tf.get_variable('b', [num_classes])

    logits = tf.matmul(train_trees,W) + b

    output = tf.nn.softmax(logits)
    print 'output',output.get_shape()

    return dict(x=x,x_1=x_1,y=y,train_trees=train_trees,saver=tf.train.Saver(),W_node=W_node,W_child=W_child,_node_rep=_node_rep,final_tree_vector=final_tree_vector,_abc_=_abc_,output=output)


def eval_network(sess,g,num_epochs, data_size,partial_trees,wether_train,num_methods,state_size=4, verbose=True,save=False,cross_validation_index=0):

    if True:

	print 'data size',data_size,save
        # initialize
#        sess.run(tf.global_variables_initializer())
        g['saver'].restore(sess,save)

	count = 0

	result = [ [] for i in range(6) ]
        training_losses = []
        for idx, epoch in enumerate(partial_tree.gen_epochs(num_epochs,batch_size, partial_trees,wether_train,cross_validation_index,num_methods)):
	    print 'epoch',idx

	    for step, (X,X_1, tree_label) in enumerate(epoch):
		output = sess.run([g['output']],feed_dict={g['x']:X,g['x_1']:X_1,g['y']:tree_label})

		softmax_value = output[0][0]
		max_index = np.where(softmax_value == np.max(softmax_value))[0][0]
		cluster_class = tree_label[0]
		result[max_index].append(cluster_class)
		if max_index == cluster_class:
		    count += 1
		    print 'step: %d  label: %d  predict: %d  True'%(step,cluster_class,max_index)
		else:
		    print 'step: %d  label: %d  predict: %d  Wrong'%(step,cluster_class,max_index)
		#print  'step',step,':',output[0][0],which_cluster[step],np.where(softmax_value == np.max(softmax_value))

	return count,result

def eval():

    abc = 3

    if True:

	if abc == 0:
	    which_cluster, cluster_name_to_index  = np.array(partial_tree.gen_raw_method_cluster('./data/methodMap.txt',6648))

	    partial_trees,node_type_size,level_width,method_indexes,parse_tree_depth = train.load_data()
	elif abc == 3:
	    which_cluster, cluster_name_to_index  = np.array(partial_tree.gen_raw_method_cluster('./test_data/methodMap.txt',30))

	    partial_trees,node_type_size,level_width,method_indexes,parse_tree_depth = train.load_test_data()

	data_file = open('./data/cluster.txt','w')
    	try:
            for (name,index) in cluster_name_to_index.items():
                data_file.write('%s,%d\n'%(name,index))
    	finally:
            data_file.close()

        print 'num of tress',len(partial_trees)
        print 'node type size:',node_type_size
        print 'max width of every level:',level_width

    	with tf.device('/cpu:0'):
	    g = model.build_graph(batch_size=batch_size,state_size=state_size,learning_rate=learning_rate,node_type_size = node_type_size,vector_size=vector_size,level_max_width = level_width,parse_tree_depth=parse_tree_depth,num_classes=num_classes)
	    sess = tf.Session()

    	    accuracy_array = []
    	    for i in range(1):
		if abc == 0:
	            accuracy,result = eval_network(sess,g=g,num_epochs=1,data_size=len(partial_trees),partial_trees=partial_trees,wether_train=0,num_methods=6648,state_size=state_size,save='weight_average_tmp/GCD/weight',cross_validation_index=i)
		elif abc == 3:
	            accuracy,result = eval_network(sess,g=g,num_epochs=1,data_size=len(partial_trees),partial_trees=partial_trees,wether_train=3,num_methods=30,state_size=state_size,save='weight_average_old/GCD/weight',cross_validation_index=i)
	        accuracy_array.append(accuracy)

		matrix = [ [0 for k in range(6)] for j in range(6)]
		m_i = [ 0 for i in range(6)]
		for m in range(len(result)):
		    _abc = np.array(result[m])
		    m_i[m] = len(_abc)# + 0.00000001

		    matrix[m][0] = len(np.where(_abc == 0)[0])
		    matrix[m][1] = len(np.where(_abc == 1)[0])
		    matrix[m][2] = len(np.where(_abc == 2)[0])
		    matrix[m][3] = len(np.where(_abc == 3)[0])
		    matrix[m][4] = len(np.where(_abc == 4)[0])
		    matrix[m][5] = len(np.where(_abc == 5)[0])

		print m_i
		print matrix

		num = 0
		for k in matrix:
		    for m in k:
			num += m

		print num

#		'''
		e_i = [0 for x in range(0,6)]  
		p_i = [0 for x in range(0,6)]  
		for k in range(0,6):  
    		    wr_line_part = ","  
    		    for m in range(0,6):  
        		wr_line_part += str(matrix[k][m]) + ','  
			if m_i[k] > 0:
        		    p_i_j = matrix[k][m]*1.0/m_i[k]  + 0.00000001  
			else:
			    p_i_j = 0.00000001
        		e_i[k] += 0 - p_i_j*math.log(p_i_j,2)  
        		if (p_i[k] < p_i_j):  
            		    p_i[k] = p_i_j  
    
		member_num = 0 
		if abc == 3:
                    member_num = 30
                elif abc == 0:
                    member_num = 6648
 
		e = 0  
		p = 0             
		for k in range(0,6):  
    		    e += float(m_i[k])/member_num*e_i[k]  
    		    p += float(m_i[k])/member_num*p_i[k]  

		print 'entrop',e,'purity',p

		#calF1.calF1(matrix)
		assignLabel.calF1(matrix)

#		'''
	    sess.close()

    	    num = 0
    	    for i in accuracy_array:
	        num += i

            if abc == 3:
                print 'accuracy',float(num)/30
                return float(num) / 30
            elif abc == 0:
                print 'accuracy',float(num)/6648
                return float(num) / 6648


if __name__ == '__main__':

    eval()
