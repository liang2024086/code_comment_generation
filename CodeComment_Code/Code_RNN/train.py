#-*- coding: utf-8 -*
import numpy as np
import tensorflow as tf
import timeit
import random
import time
import os
import sys

import eval
from CustomRNNCell import CustomRNNCell
import model
import test
import partial_tree

batch_size = 1
state_size = 4
learning_rate = 0.1
num_classes = 6

### method 
call_graph_level = 0
vector_size = 50

"""
Function to train the network
"""
def train_network(sess,g,num_epochs, data_size,partial_trees,state_size=4, verbose=True,save=False,cross_validation_index=0):

    # determine the number of threads

    if True:

        training_losses = []

        for idx, epoch in enumerate(partial_tree.gen_epochs(num_epochs,batch_size, partial_trees,0,cross_validation_index,6648)):
            training_loss = 0
            training_state = np.zeros((batch_size, state_size))

            epoch_loss = 0
	    epoch_count = 0

            time_start = time.time()

            #if verbose:
            #    print "\nEPOCH", idx
            for step, (X,X_1, tree_label) in enumerate(epoch):
		
		#training_loss_,W_node,W_child,final_tree_vector,train_trees = sess.run([g['total_loss'],g['W_node'],g['W_child'],g['final_tree_vector'],g['train_trees']],feed_dict={g['x']:X,g['x_1']:X_1,g['x_num_sub_trees']:X_num_sub_trees,g['y']:tree_label})
		training_loss_,train_step,W_node,W_child,final_tree_vector,train_trees = sess.run([g['total_loss'],g['train_step'],g['W_node'],g['W_child'],g['final_tree_vector'],g['train_trees']],feed_dict={g['x']:X,g['x_1']:X_1,g['y']:tree_label})
		
                training_loss += training_loss_
		epoch_loss += training_loss_
		epoch_count += 1
                time_end = time.time()
		'''
		print 'step',step,':',training_loss_
            	print 'time',time_end-time_start,'s'
                if step % 10 == 0 and step > 0:
                    if verbose:
                        print "Average loss at step", step,\
                              "for epoch",float(batch_size)*step/data_size,":", training_loss/10

			#print 'final tree vector',final_tree_vector
			#print 'train trees',train_trees
			#print 'W node',W_node[10]
			#print 'W child',W_child
 
                	#g['saver'].save(sess,"GCD/weight")
                	#print ('save')

                    training_losses.append(training_loss/100)
                    training_loss = 0
		'''
	    '''
            if idx % 20 == 0:
	    	if not os.path.exists('weight/GCD_%d_%d'%(cross_validation_index,idx)):
		    os.makedirs('weight/GCD_%d_%d'%(cross_validation_index,idx))

		print 'epoch',idx
            	print 'time',time_end-time_start,'s'
            	print 'epoch loss:',epoch_loss/epoch_count
            	g['saver'].save(sess,'weight/GCD_%d_%d/weight'%(cross_validation_index,idx))
            	print ('save')
	    '''
            print 'time',time_end-time_start,'s'
            print 'epoch loss:',epoch_loss/epoch_count
            g['saver'].save(sess,'weight_average_tmp/GCD/weight')
            print ('save')
	    #'''

	accuracy = eval.eval('train')

    return accuracy

def train():
    for a, c in enumerate(reader.gen_epochs(3,batch_size,num_steps)):
        for b,(x,y) in enumerate(c):
            print ('X',x)
            print ('Y',y)

def save_data(folder,level_trees,node_type_size,level_width,method_indexes,tree_depth):
    tree_narray = np.array(level_trees)
    np.save(folder+'/level_tree.npy',tree_narray)

    np.save(folder+'/method_indexes.npy',np.array(method_indexes))

    data_file = open(folder+'/tree_data.txt','w')
    try:
        data_file.write('%d\n'%node_type_size)
        data_file.write('%d\n'%level_width)
	data_file.write('%d'%tree_depth)
    finally:
	data_file.close()

def save_data_yield(level_trees,node_type_size,level_width,method_indexes,tree_depth,step):
    tree_narray = np.array(level_trees)
    np.save('./test_data/level_tree_%d.npy'%step,tree_narray)

    np.save('./test_data/method_indexes_%d.npy'%step,np.array(method_indexes))

    data_file = open('./testdata/tree_data.txt','w')
    try:
        data_file.write('%d\n'%node_type_size)
        data_file.write('%d\n'%level_width)
	data_file.write('%d'%tree_depth)
    finally:
	data_file.close()

def load_data():
    partial_trees = np.load('./data/level_tree.npy')
    method_indexes = np.load('./data/method_indexes.npy')

    data_file = open('./data/tree_data.txt','r')
    data_lines = data_file.readlines()
    node_type_size = int(data_lines[0].strip())
    level_width = int(data_lines[1].strip())
    _tree_depth = int(data_lines[2].strip())

    return partial_trees,node_type_size,level_width,method_indexes,_tree_depth

def load_test_data():
    partial_trees = np.load('./test_data/level_tree.npy')
    method_indexes = np.load('./test_data/method_indexes.npy')

    data_file = open('./test_data/tree_data.txt','r')
    data_lines = data_file.readlines()
    node_type_size = int(data_lines[0].strip())
    level_width = int(data_lines[1].strip())
    _tree_depth = int(data_lines[2].strip())

    return partial_trees,node_type_size,level_width,method_indexes,_tree_depth

def load_val_data():
    partial_trees = np.load('./val_data/level_tree.npy')
    method_indexes = np.load('./val_data/method_indexes.npy')

    data_file = open('./val_data/tree_data.txt','r')
    data_lines = data_file.readlines()
    node_type_size = int(data_lines[0].strip())
    level_width = int(data_lines[1].strip())
    _tree_depth = int(data_lines[2].strip())

    return partial_trees,node_type_size,level_width,method_indexes,_tree_depth

def load_rename_data():
    partial_trees = np.load('./rename_data/level_tree.npy')
    method_indexes = np.load('./rename_data/method_indexes.npy')

    data_file = open('./rename_data/tree_data.txt','r')
    data_lines = data_file.readlines()
    node_type_size = int(data_lines[0].strip())
    level_width = int(data_lines[1].strip())
    _tree_depth = int(data_lines[2].strip())

    return partial_trees,node_type_size,level_width,method_indexes,_tree_depth

def load_before_data():
    partial_trees = np.load('./before_rename_data/level_tree.npy')
    method_indexes = np.load('./before_rename_data/method_indexes.npy')

    data_file = open('./before_rename_data/tree_data.txt','r')
    data_lines = data_file.readlines()
    node_type_size = int(data_lines[0].strip())
    level_width = int(data_lines[1].strip())
    _tree_depth = int(data_lines[2].strip())

    return partial_trees,node_type_size,level_width,method_indexes,_tree_depth

def load_test_new_data():
    partial_trees = np.load('./test_new_data/level_tree.npy')
    method_indexes = np.load('./test_new_data/method_indexes.npy')

    data_file = open('./test_new_data/tree_data.txt','r')
    data_lines = data_file.readlines()
    node_type_size = int(data_lines[0].strip())
    level_width = int(data_lines[1].strip())
    _tree_depth = int(data_lines[2].strip())

    return partial_trees,node_type_size,level_width,method_indexes,_tree_depth

if __name__ == '__main__':

    not_increase_limit = sys.argv[1]
    if True:


        partial_trees,node_type_size,level_width,method_indexes,parse_tree_depth = load_data()

    	print 'num of tress',len(partial_trees)
    	print 'node type size:',node_type_size
    	print 'max width of every level:',level_width
#    	print num_sub_trees

#        '''

	previous_accuracy = 0
    	not_increase = 0

    	g = model.build_graph(batch_size=batch_size,state_size=state_size,learning_rate=learning_rate,node_type_size = node_type_size,vector_size=vector_size,level_max_width = level_width,parse_tree_depth=parse_tree_depth,num_classes=num_classes)
	sess = tf.Session()
	# initialize
        sess.run(tf.global_variables_initializer())
#        g['saver'].restore(sess,'weight_average_tmp/GCD/weight')

    	count = 0
    	while True:
	    count += 1
	    print 'EPOCH',count


	    if not os.path.exists('weight_average/GCD'):
	        os.makedirs('weight_average/GCD')
	    if not os.path.exists('weight_average_tmp/GCD'):
	        os.makedirs('weight_average_tmp/GCD')

            accuracy = train_network(sess,g=g,num_epochs=1,data_size=len(partial_trees),partial_trees=partial_trees,state_size=state_size,save='weight_average/GCD_/weight',cross_validation_index=0)

	    if accuracy <= previous_accuracy:
                not_increase += 1
            else:
                not_increase = 0
                previous_accuracy = accuracy
                g['saver'].save(sess,'weight_average/GCD/weight')
                print ('save')

            if not_increase == not_increase_limit:
                break

        sess.close()

