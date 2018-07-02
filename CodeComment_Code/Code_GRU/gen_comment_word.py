import tensorflow as tf
import numpy as np
from copy import deepcopy


max_children_size = 100000

def _read_lines(fileName):
    if not tf.gfile.Exists(fileName):
        tf.logging.fatal('File does not exist %s', fileName)
    '''
    read all content of the file at once f.read()
    read lines : f.readlines()
    '''
    with tf.gfile.GFile(fileName,'r') as f:
        return f.readlines()

def _read_raw_comments(fileName,repo_name):

    word_index_to_word = {}
    word_index_to_word[0] = '</s>'

    word_map={}
    word_map['</s>'] = 0
    word_index = 1
    lines = _read_lines(fileName)
    for line in lines:
	new_words = []
	words = line.replace('\n','').replace('\t',' ').split(' ')
	for word in words:
	    if word != '' and not word_map.has_key(word):
		word_map[word] = word_index
		word_index_to_word[word_index] = word
		word_index += 1
		new_words.append(word)
    
    word_map['UNK'] = word_index
    word_index_to_word[word_index] = 'UNK'
    word_index += 1
    word_map['START'] = word_index
    word_index_to_word[word_index] = 'START'

    data_file = open('./gen_vector/repo_mockito/commentWordMap.txt','w')
    #data_file = open('./output_%s/commentWordMap.txt'%repo_name,'w')

    try:
	for (index_,word_) in word_index_to_word.items():
	    data_file.write('%d , %s\n'%(index_,word_))
    finally:

        data_file.close()
    print 'generate comment word map successful'


if __name__ == '__main__':

    #repos = ['cocos2d','guava','guice','jersey','rhino','zxing']
    repos = ['jna']
    for repo in repos:
	_read_raw_comments('./gen_vector/repo_mockito/comments.txt',repo)
	#_read_raw_comments('./output_%s/comments.txt'%repo,repo)
