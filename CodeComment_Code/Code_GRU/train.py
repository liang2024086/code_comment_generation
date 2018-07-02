import numpy as np
import tensorflow as tf
import time
import os

import reader
import model
import eval

batch_size = 10
state_size = 512
num_steps = 5
learning_rate = 0.05

def train(sess,num_epochs,batch_size,num_steps,method_vectors,method_comments,bodies_array,g,indexToWord):

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


	    g['saver'].save(sess,'CR_temp/weight')
	    print 'time',time.time()-time_start,'s'
	    print 'epoch loss',total_loss/count
	    
	value, result_info = eval.begin_eval(1)
		#os.system('python eval.py 1')

	return value,result_info



if __name__ == '__main__':

    '''

    repo = 'all'

    methods = np.load('./comment_%s_data/comment_method_vector.npy'%repo)
    print 'shape of method vectors',methods.shape

    index_array = [ i for i in range(len(methods))]
    print index_array

    index_array = np.random.permutation(index_array)
    print index_array

    np.save('./comment_all_data/random_index_array.npy',index_array)

    '''
    repo = 'Smack'

    #random_index = np.load('./comment_%s_data/random_index_array.npy'%repo)
    #print 'shape of random index',random_index.shape

    methods = np.load('data/comment_%s_data/comment_method_vector.npy'%repo)
    print 'shape of method vectors',methods.shape

    comment_array = np.load('data/comment_%s_data/comment_array.npy'%repo)
    print 'shape of comment array',comment_array.shape

    comment_indexes = np.load('data/comment_%s_data/comment_index.npy'%repo)
    print 'shape of comment index',comment_indexes.shape

    vector_size = len(methods[0])
    print 'vector size',vector_size

    bodies_array = np.load('data/body/body_%s/bodies_array.npy'%repo)
    print 'shape of bodies array',bodies_array.shape
    body_length = len(bodies_array[0])

    bodyWordToIndex, bodyIndexToWord = reader._read_comments_word('data/buildData/body_words/repo_%s/bodyWordMap.txt'%repo)
    body_vocab_size = len(bodyWordToIndex)

    wordToIndex, indexToWord = reader._read_comments_word('data/buildData/comment_words/repo_%s/commentWordMap.txt'%repo)
    print 'length',len(wordToIndex),len(indexToWord)
    num_classes = len(wordToIndex)

    if not os.path.exists('CR'):
    	os.makedirs('CR')
    if not os.path.exists('CR_temp'):
    	os.makedirs('CR_temp')


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
	    CoreNLP  4311
		train: 4000
		validation: 100
		test: 211
        value,result_info = train(sess,1,batch_size,num_steps,methods[:4000],comment_array[:4000],bodies_array[:4000],g,indexToWord) 
	'''

	'''
	    Smack 2342
		train: 2100
		validation: 80
		test: 162
	'''
        value,result_info = train(sess,1,batch_size,num_steps,methods[:2100],comment_array[:2100],bodies_array[:2100],g,indexToWord) 

	'''
            jersey 2539
                train: 2300
                validation: 50
                test: 189
        value,result_info = train(sess,1,batch_size,num_steps,methods[:2300],comment_array[:2300],bodies_array[:2300],g,indexToWord)
        '''

	'''
            guava 2530
                train 2300
                validation: 70
                test: 160
        value,result_info = train(sess,1,batch_size,num_steps,methods[:2300],comment_array[:2300],bodies_array[:2300],g,indexToWord)
        '''

	'''
            elasticsearch  3663
                train 3400
                validation: 80
                test: 183
        value,result_info = train(sess,1,batch_size,num_steps,methods[:3400],comment_array[:3400],bodies_array[:3400],g,indexToWord)
        '''

	'''
            jclouds 1598
                train 1400
                validation 70
                test 128
        value,result_info = train(sess,1,batch_size,num_steps,methods[:1400],comment_array[:1400],bodies_array[:1400],g,indexToWord)
        '''

        '''
            functionaljava
                train 2100
                validation 40
                test 123
        value,result_info = train(sess,1,batch_size,num_steps,methods[:2100],comment_array[:2100],bodies_array[:2100],g,indexToWord)
        '''

	''' 
            jmonkeyengine 3630
                train 3400
                validation 50
                test 180
        value,result_info = train(sess,1,batch_size,num_steps,methods[:3400],comment_array[:3400],bodies_array[:3400],g,indexToWord)
        '''

	'''
            jOOQ 1984
                train 1700
                validation 80
                test 204
        value,result_info = train(sess,1,batch_size,num_steps,methods[:1700],comment_array[:1700],bodies_array[:1700],g,indexToWord)
        '''

	'''
            weblaf 4171
                train 3900
                validation 80
                test 191
        value,result_info = train(sess,1,batch_size,num_steps,methods[:3900],comment_array[:3900],bodies_array[:3900],g,indexToWord)
        '''

	'''
            rhino 1187
                train 1000
                validation 40
                test 147
        value,result_info = train(sess,1,batch_size,num_steps,methods[:1000],comment_array[:1000],bodies_array[:1000],g,indexToWord)
        '''

        '''
            cocos2d 1181
                train 1000
                validation 40
                test 141
        value,result_info = train(sess,1,batch_size,num_steps,methods[:1000],comment_array[:1000],bodies_array[:1000],g,indexToWord)
        '''

        '''
            Activiti 1071
                train 900
                validation 40
                test 131
        value,result_info = train(sess,1,batch_size,num_steps,methods[:900],comment_array[:900],bodies_array[:900],g,indexToWord)
        '''

        '''
            neo4j 1197
                train 1000
                validation 40
                test 157
        value,result_info = train(sess,1,batch_size,num_steps,methods[:1000],comment_array[:1000],bodies_array[:1000],g,indexToWord)
        '''

        '''
            libgdx 2823
                train 2600
                validation 50
                test 173
        value,result_info = train(sess,1,batch_size,num_steps,methods[:2600],comment_array[:2600],bodies_array[:2600],g,indexToWord)
        '''

	'''
	    spring-batch 1827
		train 1600
		validation 50
		test 177
        value,result_info = train(sess,1,batch_size,num_steps,methods[:1600],comment_array[:1600],bodies_array[:1600],g,indexToWord)
	'''

	'''
	    aima-java 1127
		train 1000
		validation 27
		test 100
        value,result_info = train(sess,1,batch_size,num_steps,methods[:1000],comment_array[:1000],bodies_array[:1000],g,indexToWord)
	'''

        #value,result_info = train(sess,1,batch_size,num_steps,methods[random_index[:6000]],comment_array[random_index[:6000]],g,indexToWord) 
        #train(sess,1,batch_size,num_steps,methods,comment_array,g,indexToWord) 
	print 'F2 VALUE',value,previous_value,not_increase

	if value <= previous_value:
	    not_increase += 1
	else:
	    not_increase = 1
	    previous_value = value
	    g['saver'].save(sess,'CR/weight')
	    print 'save'
	    print result_info

	#if not_increase == 100:
	if count == 800:
	    break

    sess.close()

