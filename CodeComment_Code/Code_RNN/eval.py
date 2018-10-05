import numpy as np
import tensorflow as tf
import random
import math
import sys

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

def eval_network(sess,g,num_epochs, data_size,partial_trees,wether_train,num_methods,state_size=4, verbose=True,save=False,cross_validation_index=0):

    if True:

	#print 'data size',data_size,save
        # initialize
#        sess.run(tf.global_variables_initializer())
        g['saver'].restore(sess,save)

	count = 0

	result = [ [] for i in range(6) ]
        training_losses = []
        for idx, epoch in enumerate(partial_tree.gen_epochs(num_epochs,batch_size, partial_trees,wether_train,cross_validation_index,num_methods)):
	    #print 'epoch',idx

	    for step, (X,X_1, tree_label) in enumerate(epoch):
		output = sess.run([g['output']],feed_dict={g['x']:X,g['x_1']:X_1,g['y']:tree_label})

		softmax_value = output[0][0]
		max_index = np.where(softmax_value == np.max(softmax_value))[0][0]
		cluster_class = tree_label[0]
		result[max_index].append(cluster_class)
		if max_index == cluster_class:
		    count += 1
		    #print 'step: %d  label: %d  predict: %d  True'%(step,cluster_class,max_index)
		#else:
		#    print 'step: %d  label: %d  predict: %d  Wrong'%(step,cluster_class,max_index)
		#print  'step',step,':',output[0][0],which_cluster[step],np.where(softmax_value == np.max(softmax_value))

	return count,result

def eval(type):

    if type == 'train':
        abc = 0
    elif type == 'test':
        abc = 2
    elif type == 'val':
        abc = 1

    if True:

	if abc == 0:
	    partial_trees,node_type_size,level_width,method_indexes,parse_tree_depth = train.load_data()
	elif abc == 2:
	    partial_trees,node_type_size,level_width,method_indexes,parse_tree_depth = train.load_test_data()
	elif abc == 1:
	    partial_trees,node_type_size,level_width,method_indexes,parse_tree_depth = train.load_val_data()

        #print 'num of tress',len(partial_trees)
        #print 'node type size:',node_type_size
        #print 'max width of every level:',level_width

    	with tf.device('/cpu:0'):
	    g = model.build_graph(batch_size=batch_size,state_size=state_size,learning_rate=learning_rate,node_type_size = node_type_size,vector_size=vector_size,level_max_width = level_width,parse_tree_depth=parse_tree_depth,num_classes=num_classes)
	    sess = tf.Session()

    	    accuracy_array = []
    	    for i in range(1):
		if abc == 0:
	            accuracy,result = eval_network(sess,g=g,num_epochs=1,data_size=len(partial_trees),partial_trees=partial_trees,wether_train=0,num_methods=6648,state_size=state_size,save='weight_average_tmp/GCD/weight',cross_validation_index=i)
		elif abc == 2:
	            accuracy,result = eval_network(sess,g=g,num_epochs=1,data_size=len(partial_trees),partial_trees=partial_trees,wether_train=2,num_methods=30,state_size=state_size,save='weight_average/GCD/weight',cross_validation_index=i)
		elif abc == 1:
	            accuracy,result = eval_network(sess,g=g,num_epochs=1,data_size=len(partial_trees),partial_trees=partial_trees,wether_train=1,num_methods=1997,state_size=state_size,save='weight_average/GCD/weight',cross_validation_index=i)
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

		#print m_i
		#print matrix

		num = 0
		for k in matrix:
		    for m in k:
			num += m

		#print num

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
                if abc == 2:
                    member_num = 30
                elif abc == 0:
                    member_num = 6648
                elif abc == 1:
                    member_num = 1997
 
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

            if abc == 2:
                print 'accuracy',float(num)/30
                return float(num) / 30
            elif abc == 0:
                print 'accuracy',float(num)/6648
                return float(num) / 6648
            elif abc == 1:
                print 'accuracy',float(num)/1997
                return float(num) / 1997


if __name__ == '__main__':

    eval(sys.argv[1])
