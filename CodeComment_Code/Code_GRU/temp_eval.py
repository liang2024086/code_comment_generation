#-*- coding: utf-8 -*
import tensorflow as tf
import numpy as np
from sys import argv
from pyrouge import Rouge155

import reader
import model

batch_size = 1
state_size = 512
num_steps = 1
learning_rate = 0.1

r = Rouge155()
r.system_dir = 'rouge_data/system_summaries'
r.model_dir = 'rouge_data/model_summaries'

def eval(sess,num_epochs,batch_size,num_steps,num_classes,method_vectors,method_comments,g,index_to_word,word_to_index,argvss):

    if True:

	model_strings = []
	system_strings = []

	for idx,epoch in enumerate(reader.gen_eval_epoch(num_epochs,batch_size,num_steps,method_vectors,method_comments)):
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
#		    print index_to_word['%d'%index],
	    print model_string

	    print '\033[1;32;40mgenerated \033[0m'    #<!--1-高亮显示 34-前景色blue  47-背景色write-->

	    word_index = [[0]]
	    count = 0
	    system_string = ''
	    system_count = 0
            for step,(x,y1,y2) in enumerate(epoch):
		if count == 0:
		    word_index_ = [[int(word_to_index['START'])]]


                training_state,pred = sess.run([g['final_state'],g['prediction']],feed_dict={g['x']:x,g['init_state']:training_state,g['y']:word_index_,g['input_keep_prob']:1.0,g['output_keep_prob']:1.0})
                count += 1
		prediction = pred[0][0]
		#print prediction
		#print prediction.shape
		word_index =  np.where(prediction==np.max(prediction))[0][0]
	#	print 'word index',word_index
		word_index_ = [[word_index]]
		#print index_to_word['%d'%word_index],training_state
		if word_index == 0 or count > 50:
		    break
		if word_index == int(word_to_index['START']):
		    continue
		if system_count == 0:
		    system_string += index_to_word['%d'%word_index]
		    system_count = 1
		else:
		    system_string += ' ' + index_to_word['%d'%word_index]

	    
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

def begin_eval(para):

    repo = 'jersey'

    methods = np.load('./comment_%s_data/comment_method_vector.npy'%repo)
    print 'shape of method vectors',methods.shape

    comment_array = np.load('./comment_%s_data/comment_array.npy'%repo)
    print 'shape of comment array',comment_array.shape

    vector_size = len(methods[0])
    print 'vector size',vector_size

    wordToIndex, indexToWord = reader._read_comments_word('./gen_vector/repo_%s/commentWordMap.txt'%repo)
    print 'length',len(wordToIndex),len(indexToWord)
    num_classes = len(wordToIndex)

    #random_index = np.load('./comment_%s_data/random_index_array.npy'%repo)

    if para == '3':
	state_size = 1
    else:
	state_size = 512

    g = model.build_graph(batch_size,state_size,learning_rate,num_steps,vector_size,num_classes)

    gpu_options = tf.GPUOptions(allow_growth=True)
    sess = tf.Session(config=tf.ConfigProto(gpu_options=gpu_options,intra_op_parallelism_threads=8))
    if para == 1:
	g['saver'].restore(sess,'CR_temp/weight')
    else:
	g['saver'].restore(sess,'CR/weight')

    system_strings, model_strings = eval(sess,240,batch_size,num_steps,num_classes,methods[2300:2540],comment_array[2300:2540],g,indexToWord,wordToIndex,para)
    #system_strings, model_strings = eval(sess,621,batch_size,num_steps,num_classes,methods[random_index[6000:6621]],comment_array[random_index[6000:6621]],g,indexToWord,wordToIndex,para)

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
    value,result_info = begin_eval(int(argvs[1]))
    print result_info
