import numpy as np
import tensorflow as tf
import random

from CommentRNNCell import CommentRNNCell

def reset_graph():
#    if 'sess' in globals() and sess:
#        sess.close()
    tf.reset_default_graph()

def build_graph(batch_size, state_size, learning_rate, num_steps,vector_size,num_classes,body_length,body_vocab_size):

    with tf.device('/gpu:0'):
        reset_graph()

	'''
	Placeholders
	'''

	x = tf.placeholder(tf.float32,[batch_size,vector_size], name = 'input_holder')
	print 'shape of x',x.get_shape()

	y = tf.placeholder(tf.int32,[batch_size,num_steps], name = 'target_holder')
	print 'shape of y',y.get_shape()

	y_label = tf.placeholder(tf.int32,[batch_size,num_steps], name = 'target_holder')
	print 'shape of y_label',y_label.get_shape()

	bodies = tf.placeholder(tf.int32,[batch_size,body_length], name = 'body_holder')
	print 'shape of bodies',bodies.get_shape()

	input_keep_prob = tf.placeholder(tf.float32)
	output_keep_prob = tf.placeholder(tf.float32)

	init_state = tf.zeros([batch_size, state_size])

	'''
	INPUT
	'''

	rnn_inputs = tf.unstack(tf.one_hot(y,num_classes),axis=1)
	print len(rnn_inputs),rnn_inputs[0].get_shape()

	'''
	RNN
	'''

	'''
        weight and bias for RNN
        '''

        W_rnn = tf.get_variable('W_rnn',[num_classes + vector_size + state_size, state_size])
        b_rnn = tf.get_variable('b_rnn',[state_size],initializer=tf.constant_initializer(0.0))


	W_z = tf.get_variable('W_z',[state_size + num_classes, state_size])
	W_r = tf.get_variable('W_r',[state_size + num_classes, state_size])
	W_c = tf.get_variable('W_c',[state_size + num_classes, vector_size])

#	cell = tf.contrib.rnn.BasicRNNCell(state_size,activation=tf.nn.relu)
	cell = CommentRNNCell(state_size,x,vector_size,num_classes,W_rnn,b_rnn,W_z,W_r,W_c,activation=tf.nn.tanh)
	#cell = tf.contrib.rnn.core_rnn_cell.DropoutWrapper(cell,input_keep_prob=input_keep_prob,output_keep_prob=output_keep_prob)
	cell = tf.contrib.rnn.DropoutWrapper(cell,input_keep_prob=input_keep_prob,output_keep_prob=output_keep_prob)

	rnn_outputs, final_state = tf.contrib.rnn.static_rnn(cell, rnn_inputs, initial_state=init_state)

	print 'ABC',len(rnn_outputs),rnn_outputs[0].get_shape(),final_state.get_shape()

	with tf.variable_scope('softmax1'):
	    W = tf.get_variable('W', [state_size, num_classes])
	    b = tf.get_variable('b', [num_classes])

	print 'shape of W',W.get_shape()
	print 'shape of b',b.get_shape()

	logits = [tf.matmul(rnn_output, W) + b for rnn_output in rnn_outputs]
	predictions = [tf.nn.softmax(logit) for logit in logits]
	#predictions = [tf.log(prediction+0.00001) for prediction in predictions]
	#predictions = logits

	y_as_list = tf.unstack(y_label, num=num_steps, axis=1)
	print 'y as list',len(y_as_list),y_as_list[0].get_shape()

	losses = [tf.nn.sparse_softmax_cross_entropy_with_logits(labels=label, logits=logit) for \
          logit, label in zip(logits, y_as_list)]
	print 'losses',len(losses),losses[0].get_shape()

	total_loss = tf.reduce_mean(losses)
	train_step = tf.train.AdagradOptimizer(learning_rate).minimize(total_loss)

    return dict(x=x,y=y,y_label=y_label,bodies=bodies,total_loss=total_loss,train_step=train_step,init_state=init_state,final_state=final_state,saver=tf.train.Saver(),prediction=predictions,input_keep_prob=input_keep_prob,output_keep_prob=output_keep_prob)

def build_graph_dynamic(batch_size, state_size, learning_rate, num_steps,vector_size,num_classes):

    print 'dynamic rnn'

    reset_graph()

    '''
    Placeholders
    '''

    x = tf.placeholder(tf.float32,[num_steps,batch_size,vector_size], name = 'input_holder')
    print 'shape of x',x.get_shape()

    y = tf.placeholder(tf.int32,[batch_size,num_steps], name = 'target_holder')
    print 'shape of y',y.get_shape()

    init_state = tf.zeros([batch_size, state_size])

    '''
    INPUT
    '''

    '''
    RNN
    '''
    cell = tf.contrib.rnn.BasicRNNCell(state_size)
    rnn_outputs, final_state = tf.nn.dynamic_rnn(cell, x,time_major=True, initial_state=init_state)

    with tf.variable_scope('softmax'):
	W = tf.get_variable('W', [state_size, num_classes])
	b = tf.get_variable('b', [num_classes])

    print 'shape of W',W.get_shape()
    print 'shape of b',b.get_shape()

    logits = tf.reshape(
            tf.matmul(tf.reshape(rnn_outputs, [-1, state_size]), W) + b,
            [batch_size, num_steps, num_classes])
    predictions = tf.nn.softmax(logits)
    print 'shape of logits',logits.get_shape()

    losses = tf.nn.sparse_softmax_cross_entropy_with_logits(labels=y, logits=logits)
    total_loss = tf.reduce_mean(losses)
    train_step = tf.train.AdagradOptimizer(learning_rate).minimize(total_loss)

    return dict(x=x,y=y,total_loss=total_loss,train_step=train_step,init_state=init_state,final_state=final_state)

def generate_text(g,checkpoint,num_words,prompt=23,pick_top_words=None):

    with tf.Session() as sess:
        sess.run(tf.global_variables_initializer())
        g['saver'].restore(sess,checkpoint)

        state = None
        current_word = prompt
        words = [current_word]

        for i in range(num_words):
            if state is not None:
                feed_dict={g['x']:[[current_word]],g['init_state']:state}
            else:
                feed_dict={g['x']:[[current_word]]}

            preds, state = sess.run([g['preds'],g['final_state']],feed_dict)
	
            if pick_top_words is not None:
                p = np.squeeze(preds)
                p[np.argsort(p)[:-pick_top_words]] = 0
                p = p / np.sum(p)
                current_word = np.random.choice(298,1,p=p)[0]
            else:
                current_word = np.random.choice(298,1,p=np.squeeze(preds))[0]

            words.append(current_word)
    
    wordToIndex,indexToWord = reader._read_comments_word('data/commentWordMap.txt')

    rawWords = []
    for word in words:
        rawWords.append(indexToWord['%d'%word])
    return rawWords

