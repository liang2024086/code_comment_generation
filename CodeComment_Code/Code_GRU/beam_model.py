import numpy as np
import tensorflow as tf
import random

from CommentRNNCell import CommentRNNCell
import beam_search

def reset_graph():
#    if 'sess' in globals() and sess:
#        sess.close()
    tf.reset_default_graph()

def build_graph(batch_size, state_size, learning_rate, num_steps,vector_size,num_classes,body_length,body_vocab_size,beam_size,config):

    with tf.device('/gpu:0'):
        reset_graph()

	'''
	Placeholders
	'''

	x_beam = tf.placeholder(tf.float32,[beam_size,batch_size,vector_size], name = 'input_holder')
	#print 'shape of x_beam',x_beam.get_shape()

	y_beam = tf.placeholder(tf.int32,[beam_size,batch_size,num_steps], name = 'target_holder')
	#print 'shape of y_beam',y_beam.get_shape()

	bodies = tf.placeholder(tf.int32,[batch_size,body_length])
	#print 'shape of bodies',bodies.get_shape()

	input_keep_prob = tf.placeholder(tf.float32)
	output_keep_prob = tf.placeholder(tf.float32)

	'''
        weight and bias for RNN
        '''

        W_rnn = tf.get_variable('W_rnn',[num_classes + vector_size + state_size, state_size])
	print 'shape of W_rnn', W_rnn.get_shape()
        b_rnn = tf.get_variable('b_rnn',[state_size],initializer=tf.constant_initializer(0.0))


	W_z = tf.get_variable('W_z',[state_size + num_classes, state_size])
	W_r = tf.get_variable('W_r',[state_size + num_classes, state_size])
	W_c = tf.get_variable('W_c',[state_size + num_classes, vector_size])

	with tf.variable_scope('softmax1'):
	    W = tf.get_variable('W', [state_size, num_classes])
	    b = tf.get_variable('b', [num_classes])

	#print 'shape of W',W.get_shape()
	#print 'shape of b',b.get_shape()

	training_state_beam = tf.zeros([beam_size,batch_size, state_size])
	#print 'shape of initial training state beam',training_state_beam.get_shape()

	beam_state = beam_search.create_initial_beam_state(config)
	#print 'shape of initial beam state',beam_state
	
	predicted_ids = []
	beam_parents_ids = []

	for k in range(50):

	    beam_logits = []
	    beam_training_state = []
	    #print 'shape of gen y',y_beam.get_shape()
	    for beam_index in range(beam_size):
		if k == 0:
		    logits,training_state = gen_word_graph(batch_size,state_size,vector_size,num_classes,x_beam[beam_index],y_beam[beam_index],input_keep_prob,output_keep_prob,training_state_beam[beam_index],W_rnn,b_rnn,W_z,W_r,W_c,W,b,bodies,body_vocab_size,body_length,num_steps)
		else:
		    logits,training_state = gen_word_graph(batch_size,state_size,vector_size,num_classes,x_beam[beam_index],new_y_beam[beam_index],input_keep_prob,output_keep_prob,training_state_beam[beam_index],W_rnn,b_rnn,W_z,W_r,W_c,W,b,bodies,body_vocab_size,body_length,num_steps)
		beam_logits.append(logits[0][0])
		beam_training_state.append(training_state)

	    beam_logits_ = tf.convert_to_tensor(beam_logits)
	
	    training_state_beam = tf.convert_to_tensor(beam_training_state)

	    bs_output, beam_state = beam_search.beam_search_step(time_=k,logits=beam_logits_,beam_state=beam_state,config=config)
	    #print 'shape of beam state',beam_state


	    #print bs_output.beam_parent_ids.get_shape()

	    new_y_beam = tf.expand_dims(tf.expand_dims(bs_output.predicted_ids,1),2)

	    #print 'new y beam',y_beam

	    training_state_beam = []	    

	    training_state_beam = tf.gather(beam_training_state,bs_output.beam_parent_ids)

	    #print 'training state beam',training_state_beam.get_shape()

	    predicted_ids.append(bs_output.predicted_ids)
	    beam_parents_ids.append(bs_output.beam_parent_ids)

	result_id = beam_search.gather_tree(tf.convert_to_tensor(predicted_ids),tf.convert_to_tensor(beam_parents_ids))

    return dict(x_beam=x_beam,y_beam=y_beam,input_keep_prob=input_keep_prob,output_keep_prob=output_keep_prob,result_id=result_id,saver=tf.train.Saver(),bodies=bodies)


def gen_word_graph(batch_size,state_size,vector_size,num_classes,x,y,input_keep_prob,output_keep_prob,init_state,W_rnn,b_rnn,W_z,W_r,W_c,W,b,bodies,body_vocab_size,body_length,num_steps):

    if True:
	'''
	INPUT
	'''

	#print 'shape of gen y',y.get_shape()

	rnn_inputs = tf.unstack(tf.one_hot(y,num_classes),axis=1)
	#print len(rnn_inputs),rnn_inputs[0].get_shape()

	'''
	RNN
	'''


#	cell = tf.contrib.rnn.BasicRNNCell(state_size,activation=tf.nn.relu)
	cell = CommentRNNCell(state_size,x,vector_size,num_classes,W_rnn,b_rnn,W_z,W_r,W_c,activation=tf.nn.tanh)
	#cell = tf.contrib.rnn.core_rnn_cell.DropoutWrapper(cell,input_keep_prob=input_keep_prob,output_keep_prob=output_keep_prob)
	cell = tf.contrib.rnn.DropoutWrapper(cell,input_keep_prob=input_keep_prob,output_keep_prob=output_keep_prob)

	rnn_outputs, final_state = tf.contrib.rnn.static_rnn(cell, rnn_inputs, initial_state=init_state)

	#print 'ABC',len(rnn_outputs),rnn_outputs[0].get_shape(),final_state.get_shape()

	logits = [tf.matmul(rnn_output, W) + b for rnn_output in rnn_outputs]

    return logits,final_state

