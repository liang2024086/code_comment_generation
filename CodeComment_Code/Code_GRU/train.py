import numpy as np
import tensorflow as tf
import time
import os
import sys

import reader
import model
import eval

batch_size = 10
state_size = 512
num_steps = 5
learning_rate = 0.05

def train(sess,num_epochs,batch_size,num_steps,method_vectors,method_comments,bodies_array,g,indexToWord,repo,train_index,val_index):

    # determine the number of threads
    #with tf.Session(config=tf.ConfigProto(
  #intra_op_parallelism_threads=8)) as sess:
    #gpu_options = tf.GPUOptions(per_process_gpu_memory_fraction=0.333)  

    if True:

	print 'method vector shape',method_vectors.shape
	for idx,epoch in enumerate(reader.gen_comment_epoch(num_epochs,batch_size,num_steps,method_vectors,method_comments,bodies_array)):

	    print 'epoch:',idx


	    time_start = time.time()

	    count = 0
	    total_loss = 0
	    for step,(x,y1,y2,body,flag) in enumerate(epoch):
		if flag == 0:
		    training_state = np.zeros((batch_size,state_size))

#		print x.shape,y1.shape,y2.shape,training_state.shape
		loss, training_state,_,pred = sess.run([g['total_loss'],g['final_state'],g['train_step'],g['prediction']],feed_dict={g['x']:x,
			g['y']:y1,
			g['y_label']:y2,
			g['bodies']:body,
			g['init_state']:training_state,
			g['input_keep_prob']:1,
			g['output_keep_prob']:0.5})
		total_loss += loss
		count += 1


	    if not os.path.exists('CR_temp'):
                os.makedirs('CR_temp')
	    g['saver'].save(sess,'CR_temp/weight')
	    print 'time',time.time()-time_start,'s'
	    print 'epoch loss',total_loss/count
	    
	value, result_info = eval.begin_eval(1,repo,train_index,val_index)
		#os.system('python eval.py 1')

	return value,result_info



if __name__ == '__main__':

    repo = sys.argv[1]
    train_index = int(sys.argv[2])
    val_index= int(sys.argv[3])
    epoch_num = int(sys.argv[4])

    methods = np.load('./data/comment_%s_data/comment_method_vector.npy'%repo)
    print 'shape of method vectors',methods.shape

    comment_array = np.load('./data/comment_%s_data/comment_array.npy'%repo)
    print 'shape of comment array',comment_array.shape

    comment_indexes = np.load('./data/comment_%s_data/comment_index.npy'%repo)
    print 'shape of comment index',comment_indexes.shape

    vector_size = len(methods[0])
    print 'vector size',vector_size

    bodies_array = np.load('./data/body/body_%s/bodies_array.npy'%repo)
    print 'shape of bodies array',bodies_array.shape
    body_length = len(bodies_array[0])

    bodyWordToIndex, bodyIndexToWord = reader._read_comments_word('./data/body_words/bodyWordMap.txt')
    body_vocab_size = len(bodyWordToIndex)

    wordToIndex, indexToWord = reader._read_comments_word('./data/comment_words/commentWordMap.txt')
    print 'length',len(wordToIndex),len(indexToWord)
    num_classes = len(wordToIndex)

    g = model.build_graph(batch_size,state_size,learning_rate,num_steps,vector_size,num_classes,body_length,body_vocab_size)


    print comment_array

    gpu_options = tf.GPUOptions(allow_growth=True)
    sess = tf.Session(config=tf.ConfigProto(gpu_options=gpu_options,intra_op_parallelism_threads=8))
    sess.run(tf.global_variables_initializer())
    #g['saver'].restore(sess,'CR/weight')

    previous_value = -1
    not_increase = 0
    
    count = 0
    while True:
	count += 1
	print 'EPOCH',count

        '''
            cocos2d 1181
                train 1000
                validation 40
                test 141
        '''
        value,result_info = train(sess,1,batch_size,num_steps,methods[:train_index],comment_array[:train_index],bodies_array[:train_index],g,indexToWord,repo,train_index,val_index)

	print 'F2 VALUE',value,previous_value,not_increase

	if value <= previous_value:
	    not_increase += 1
	else:
	    not_increase = 1
	    previous_value = value
	    if not os.path.exists('CR'):
                os.makedirs('CR')
	    g['saver'].save(sess,'CR/weight')
	    print 'save'
	    print result_info

	#if not_increase == 100:
	#if count == 800:
	if count >= epoch_num:
	    break

    sess.close()

