import tensorflow as tf
import numpy as np
from copy import deepcopy


def _read_lines(fileName):
    if not tf.gfile.Exists(fileName):
        tf.logging.fatal('File does not exist %s', fileName)
    '''
    read all content of the file at once f.read()
    read lines : f.readlines()
    '''
    with tf.gfile.GFile(fileName,'r') as f:
        return f.readlines()

def _read_raw_bodies(fileName,repo_name):

    word_index_to_word = {}
    word_index_to_word[0] = '</s>'

    word_count = {}
    lines = _read_lines(fileName)
    for line in lines:
	new_line = line.split(',')[1]
	words = new_line.replace('\n','').replace('\t',' ').split(' ')
	for word in words:
	    if word != '' and not word_count.has_key(word):
		word_count[word] = 1
	    elif word_count.has_key(word):
		word_count[word] += 1   
 

    word_map={}
    word_map['</s>'] = 0
    word_index = 1
    for (word,count) in word_count.items():
	if word != '' and not word_map.has_key(word):
	    if count > 2:
		word_map[word] = word_index
		word_index_to_word[word_index] = word
		word_index += 1
    
    word_map['UNK'] = word_index
    word_index_to_word[word_index] = 'UNK'
    word_index += 1
    word_map['START'] = word_index
    word_index_to_word[word_index] = 'START'

    data_file = open('./body_words/repo_%s/bodyWordMap.txt'%repo_name,'w')

    try:
	for (index_,word_) in word_index_to_word.items():
	    data_file.write('%d , %s\n'%(index_,word_))
    finally:

        data_file.close()
    print 'generate comment word map successful'


if __name__ == '__main__':

    #repos = ['jna','cocos2d','mockito','guice','jersey','rhino','zxing','CoreNLP']
    repos = ['libgdx']
    for repo in repos:
	#_read_raw_bodies('/home/yuding/workspace/BodySeq2Seq/data/repo_%s/methodBodyMap.txt'%repo,repo)
	_read_raw_bodies('/home/yuding/workspace/RepoComment/CommentRNN/gen_vector/repo_%s/methodBodyMap.txt'%repo,repo)

