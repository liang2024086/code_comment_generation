#-*- coding: utf-8 -*
import tensorflow as tf
import numpy as np
from sys import argv
from pyrouge import Rouge155
from copy import deepcopy

import reader
import model
import beam_search
import beam_model

batch_size = 1
state_size = 512
num_steps = 1
learning_rate = 0.01
beam_size = 10

r = Rouge155()
r.system_dir = 'rouge_data/system_summaries'
r.model_dir = 'rouge_data/model_summaries'

def eval(sess,num_epochs,batch_size,num_steps,num_classes,method_vectors,method_comments,bodies_array,g,index_to_word,word_to_index,argvss):

    if True:

	model_strings = []
	system_strings = []

	for idx,(epoch,body) in enumerate(reader.gen_eval_epoch(num_epochs,batch_size,num_steps,method_vectors,method_comments,bodies_array)):
        #for idx,x in enumerate(reader.gen_eval_batch(batch_size,method_vectors)):

            print '\nepoch:',idx

            training_state = np.zeros((batch_size,state_size))

	    print '\033[1;31;40moriginal \033[0m'    #<!--1-高亮显示 31-前景色红色  40-背景色黑色-->
	   # print 'orignal comment'
	   # print '\033[0m'

	    model_string = ''
	    model_count = 0
	    for index in  method_comments[idx]:
		if index == 0:
		    break
		if index == num_classes-1:
		    continue
		else:
		    if model_count == 0:
		    	model_string += index_to_word['%d'%index]
			model_count = 1
		    else:
		    	model_string += ' ' + index_to_word['%d'%index]
		    #print index_to_word['%d'%index],index
	    print model_string

	    print '\033[1;32;40mgenerated \033[0m'    #<!--1-高亮显示 34-前景色blue  47-背景色write-->

	    system_string = ''
	    system_count = 0

	    x = epoch
	    y = [[[int(word_to_index['START'])]] for _ in range(beam_size)]


	    result_id = sess.run([g['result_id']],feed_dict={
			    g['x_beam']:[x for _ in range(beam_size)],
			    g['y_beam']:y,
			    g['bodies']:body,
			    g['input_keep_prob']:1.0,
			    g['output_keep_prob']:1.0
			})


	    #print result_id,len(result_id),result_id[0].shape

	    result_id = result_id[0]
	    system_count = 0
	    pre_index = 0
            for words in result_id:
                if words[0] == 0:
                    break
		if pre_index == words[0]:
		    continue
		pre_index = words[0]
                if system_count == 0:
                    system_string += index_to_word['%d'%words[0]]
                else:
                    system_string += ' ' + index_to_word['%d'%words[0]]
                system_count += 1


#	    file_object = open(r.system_dir+'/a.001.txt','w')
#	    file_object.writelines(system_strings)
	    file_object = open(r.system_dir+'/a.%d.txt'%idx,'w')
	    file_object.write(system_string)
	    file_object.close()

#	    file_object = open(r.model_dir+'/a.A.001.txt','w')
	    file_object = open(r.model_dir+'/a.A.%d.txt'%idx,'w')
	    file_object.write(model_string)
	    file_object.close()

	    print system_string
	    system_strings.append(system_string+'\n')
	    model_strings.append(model_string+'\n')

	return system_strings,model_strings

def begin_eval(para,penalty):

    repo = 'Smack'

    methods = np.load('data/comment_%s_data/comment_method_vector.npy'%repo)
    #print 'shape of method vectors',methods.shape

    comment_array = np.load('data/comment_%s_data/comment_array.npy'%repo)
    #print 'shape of comment array',comment_array.shape

    vector_size = len(methods[0])
    #print 'vector size',vector_size

    bodies_array = np.load('data/body/body_%s/bodies_array.npy'%repo)
    #print 'shape of bodies array',bodies_array.shape
    body_length = len(bodies_array[0])

    bodyWordToIndex, bodyIndexToWord = reader._read_comments_word('data/buildData/body_words/repo_%s/bodyWordMap.txt'%repo)
    body_vocab_size = len(bodyWordToIndex)

    wordToIndex, indexToWord = reader._read_comments_word('data/buildData/comment_words/repo_%s/commentWordMap.txt'%repo)
    #print 'length',len(wordToIndex),len(indexToWord)
    num_classes = len(wordToIndex)

    #random_index = np.load('./comment_%s_data/random_index_array.npy'%repo)

    if para == '3':
	state_size = 1
    else:
	state_size = 512


    config = beam_search.BeamSearchConfig(
	    beam_width=beam_size,
	    vocab_size=num_classes,
            eos_token=0,
            length_penalty_weight=penalty,
            choose_successors_fn=beam_search.choose_top_k)

    g = beam_model.build_graph(batch_size,state_size,learning_rate,num_steps,vector_size,num_classes,body_length,body_vocab_size,beam_size,config)

    gpu_options = tf.GPUOptions(allow_growth=True)
    sess = tf.Session(config=tf.ConfigProto(gpu_options=gpu_options,intra_op_parallelism_threads=8))
    if para == 1:
	g['saver'].restore(sess,'CR_temp/weight')
    else:
	#g['saver'].restore(sess,'CR/weight')
	g['saver'].restore(sess,'CR_%s_tab/weight'%repo)

    '''
	jersey
    system_strings, model_strings = eval(sess,50,batch_size,num_steps,num_classes,methods[2300:2350],comment_array[2300:2350],bodies_array[2300:2350],g,indexToWord,wordToIndex,para)
    system_strings, model_strings = eval(sess,189,batch_size,num_steps,num_classes,methods[2350:2539],comment_array[2350:2539],bodies_array[2350:2539],g,indexToWord,wordToIndex,2)
    '''


    '''
	Smack
    system_strings, model_strings = eval(sess,80,batch_size,num_steps,num_classes,methods[2100:2180],comment_array[2100:2180],bodies_array[2100:2180],g,indexToWord,wordToIndex,para)
    '''
    system_strings, model_strings = eval(sess,162,batch_size,num_steps,num_classes,methods[2180:2342],comment_array[2180:2342],bodies_array[2180:2342],g,indexToWord,wordToIndex,para)

    '''
	guava
    system_strings, model_strings = eval(sess,70,batch_size,num_steps,num_classes,methods[2300:2370],comment_array[2300:2370],bodies_array[2300:2370],g,indexToWord,wordToIndex,para)
    system_strings, model_strings = eval(sess,160,batch_size,num_steps,num_classes,methods[2370:2530],comment_array[2370:2530],bodies_array[2370:2530],g,indexToWord,wordToIndex,2)
    '''



    '''
	elasticsearch
    system_strings, model_strings = eval(sess,183,batch_size,num_steps,num_classes,methods[3480:3663],comment_array[3480:3663],bodies_array[3480:3663],g,indexToWord,wordToIndex,para)
    '''

    '''
	jclouds
    system_strings, model_strings = eval(sess,70,batch_size,num_steps,num_classes,methods[1400:1470],comment_array[1400:1470],bodies_array[1400:1470],g,indexToWord,wordToIndex,para)
    system_strings, model_strings = eval(sess,128,batch_size,num_steps,num_classes,methods[1470:1598],comment_array[1470:1598],bodies_array[1470:1598],g,indexToWord,wordToIndex,para)
    '''


    '''
	functionaljava
    system_strings, model_strings = eval(sess,40,batch_size,num_steps,num_classes,methods[2100:2140],comment_array[2100:2140],bodies_array[2100:2140],g,indexToWord,wordToIndex,para)
    system_strings, model_strings = eval(sess,123,batch_size,num_steps,num_classes,methods[2140:2263],comment_array[2140:2263],bodies_array[2140:2263],g,indexToWord,wordToIndex,para)
    '''



    '''
	jmonkeyengine
    system_strings, model_strings = eval(sess,180,batch_size,num_steps,num_classes,methods[3450:3630],comment_array[3450:3630],bodies_array[3450:3630],g,indexToWord,wordToIndex,para)
    '''

    '''
	jOOQ
    system_strings, model_strings = eval(sess,80,batch_size,num_steps,num_classes,methods[1700:1780],comment_array[1700:1780],bodies_array[1700:1780],g,indexToWord,wordToIndex,para)
    system_strings, model_strings = eval(sess,204,batch_size,num_steps,num_classes,methods[1780:1984],comment_array[1780:1984],bodies_array[1780:1984],g,indexToWord,wordToIndex,para)
    '''


    '''
	rhino
    system_strings, model_strings = eval(sess,40,batch_size,num_steps,num_classes,methods[1000:1040],comment_array[1000:1040],bodies_array[1000:1040],g,indexToWord,wordToIndex,para)
    system_strings, model_strings = eval(sess,147,batch_size,num_steps,num_classes,methods[1040:1187],comment_array[1040:1187],bodies_array[1040:1187],g,indexToWord,wordToIndex,para)
    '''



    '''
	cocos2d
    system_strings, model_strings = eval(sess,40,batch_size,num_steps,num_classes,methods[1000:1040],comment_array[1000:1040],bodies_array[1000:1040],g,indexToWord,wordToIndex,para)
    system_strings, model_strings = eval(sess,141,batch_size,num_steps,num_classes,methods[1040:1181],comment_array[1040:1181],bodies_array[1040:1181],g,indexToWord,wordToIndex,para)
    '''


    '''
	Activiti
    system_strings, model_strings = eval(sess,40,batch_size,num_steps,num_classes,methods[900:940],comment_array[900:940],bodies_array[900:940],g,indexToWord,wordToIndex,para)
    system_strings, model_strings = eval(sess,131,batch_size,num_steps,num_classes,methods[940:1071],comment_array[940:1071],bodies_array[940:1071],g,indexToWord,wordToIndex,para)
    '''


    '''
	neo4j
    system_strings, model_strings = eval(sess,40,batch_size,num_steps,num_classes,methods[1000:1040],comment_array[1000:1040],bodies_array[1000:1040],g,indexToWord,wordToIndex,para)
    system_strings, model_strings = eval(sess,157,batch_size,num_steps,num_classes,methods[1040:1197],comment_array[1040:1197],bodies_array[1040:1197],g,indexToWord,wordToIndex,para)
    '''


    '''
	libgdx
    system_strings, model_strings = eval(sess,50,batch_size,num_steps,num_classes,methods[2600:2650],comment_array[2600:2650],bodies_array[2600:2650],g,indexToWord,wordToIndex,para)
    system_strings, model_strings = eval(sess,173,batch_size,num_steps,num_classes,methods[2650:2823],comment_array[2650:2823],bodies_array[2650:2823],g,indexToWord,wordToIndex,para)
    '''

    '''
        spring-batch
    system_strings, model_strings = eval(sess,50,batch_size,num_steps,num_classes,methods[1600:1650],comment_array[1600:1650],bodies_array[1600:1650],g,indexToWord,wordToIndex,para)
    system_strings, model_strings = eval(sess,177,batch_size,num_steps,num_classes,methods[1650:1827],comment_array[1650:1827],bodies_array[1650:1827],g,indexToWord,wordToIndex,para)
    '''

    '''
        aima
    system_strings, model_strings = eval(sess,27,batch_size,num_steps,num_classes,methods[1000:1027],comment_array[1000:1027],bodies_array[1000:1027],g,indexToWord,wordToIndex,para)
    system_strings, model_strings = eval(sess,100,batch_size,num_steps,num_classes,methods[1027:1127],comment_array[1027:1127],bodies_array[1027:1127],g,indexToWord,wordToIndex,para)
    '''




    sess.close()

    r.system_filename_pattern = 'a.(\d+).txt'
    r.model_filename_pattern = 'a.[A-Z].#ID#.txt'

    output = r.convert_and_evaluate()
#    print(output)

    index = output.find('ROUGE-2 Average_F: ')

    value = float(output[index+19:index+26])

    #output_dict = r.output_to_dict(output)

    return value,output

if __name__ == '__main__':
    argvs = argv
    #value,result_info = begin_eval(int(argvs[1]))
    pre_value = 0
    pre_beam_size = 0
    pre_penalty = 0

    '''
    penalty = [0, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1.0]
    for i in range(1,11):
	for _penalty in penalty:    
	    beam_size = i
	    value,result_info = begin_eval(2,_penalty)
	    if value > pre_value:
		pre_beam_size = i
		pre_value = value
		pre_penalty = _penalty


    '''
    beam_size = 3
    value,result_info = begin_eval(2,0.3)


    '''
	Activiti 5 0.9
	cocos2d 9 0.3
	jersey 10 0.4
	Smack 3 0.3
    '''

    print result_info
    print pre_beam_size, pre_penalty



