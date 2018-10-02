#-*- coding: utf-8 -*
import numpy as np
import tensorflow as tf
import timeit
import random
import time
import os
import sys

import model
import partial_tree

batch_size = 1
state_size = 4
learning_rate = 0.1
num_classes = 6

### method 
call_graph_level = 0
vector_size = 50

def load_data():
    partial_trees = np.load('./comment_data/level_tree.npy')
    method_indexes = np.load('./comment_data/method_indexes.npy')

    data_file = open('./comment_data/tree_data.txt','r')
    data_lines = data_file.readlines()
    node_type_size = int(data_lines[0].strip())
    level_width = int(data_lines[1].strip())
    _tree_depth = int(data_lines[2].strip())

    return partial_trees,node_type_size,level_width,method_indexes,_tree_depth

"""
Function to train the network
"""
def train_network(sess,g,num_epochs, data_size,partial_trees,state_size=4, verbose=True,save=False,cross_validation_index=0):

    # determine the number of threads

    if True:

        training_losses = []
	trees_vector = []

        for idx, epoch in enumerate(partial_tree.gen_epochs(num_epochs,batch_size, partial_trees,3,cross_validation_index,data_size)):
            training_loss = 0

            epoch_loss = 0
	    epoch_count = 0

            time_start = time.time()

            for step, (X,X_1,tree_label) in enumerate(epoch):
		
		final_tree_vector = sess.run([g['final_tree_vector']],feed_dict={g['x']:X,g['x_1']:X_1})

		if step == 0:
                    trees_vector = final_tree_vector[0]
                else:
                    trees_vector = np.append(trees_vector,final_tree_vector[0],0)
		
		#print step, final_tree_vector[0]
                time_end = time.time()

            print 'time',time_end-time_start,'s'
	    #'''

    return trees_vector

if __name__ == '__main__':

    if True:

	REPONAME = sys.argv[1]

        partial_trees,node_type_size,level_width,method_indexes,parse_tree_depth = load_data()

    	print 'num of tress',len(partial_trees)
    	print 'node type size:',node_type_size
    	print 'max width of every level:',level_width
#    	print num_sub_trees

	previous_accuracy = 0
    	not_increase = 0

    	g = model.build_graph(batch_size=batch_size,state_size=state_size,learning_rate=learning_rate,node_type_size = node_type_size,vector_size=vector_size,level_max_width = level_width,parse_tree_depth=parse_tree_depth,num_classes=num_classes)


	gpu_options = tf.GPUOptions(allow_growth=True)
	sess = tf.Session(config=tf.ConfigProto(gpu_options=gpu_options,intra_op_parallelism_threads=8))

	# initialize
        g['saver'].restore(sess,'weight_average/GCD/weight')

    	count = 0
    	if True:
	    count += 1
	    print 'EPOCH',count


	    for i in range(1):
		partial_trees,node_type_size,level_width,method_indexes,parse_tree_depth = load_data()

		print len(partial_trees)

		tree_vectors = train_network(sess,g=g,num_epochs=1,data_size=len(partial_trees),partial_trees=partial_trees,state_size=state_size,save='weight_average/GCD_/weight',cross_validation_index=0)

		if i == 0:
		    final_tree_vector = tree_vectors
		    final_tree_index = method_indexes
		else:
		    final_tree_vector = np.concatenate((final_tree_vector,tree_vectors))
		    final_tree_index = np.concatenate((final_tree_index,method_indexes))

		print 'tree vectors',tree_vectors.shape

            if not os.path.exists('method_vector'):
                os.makedirs('method_vector')
	    np.save('./method_vector/methods_%s.npy'%REPONAME,final_tree_vector)
	    np.save('./method_vector/methods_%s_indexes.npy'%REPONAME,final_tree_index)
	    
	    print 'save successful'
	    print 'final tree vector',final_tree_vector.shape
	    print 'final tree index',final_tree_index.shape

        sess.close()

