import numpy as np
import tensorflow as tf
import time
import os
import sys

import reader
import model
import eval

num_steps = 5

def gen_body_array(repo_name):

    directory = '../Code_RNN/comment_data'

    wordToIndex, indexToWord = reader._read_comments_word('./data/body_words/bodyWordMap.txt')
    methodBodies, max_length = reader._read_comments(directory+'/methodBodyMap.txt',wordToIndex)

    comment_index = np.load('../Code_RNN/method_vector/methods_%s_indexes.npy'%repo_name)

    bodies = []

    _max_length = 100

    for index in comment_index:
        body_words = methodBodies['%d'%index]
        new_bodies = []
        for i in range(_max_length):
            if i < len(body_words):
                new_bodies.append(int(body_words[i]))
            else:
                new_bodies.append(-1)
        bodies.append(new_bodies)

    print np.array(bodies).shape
    if not os.path.exists('data/body/body_%s'%repo_name):
        os.makedirs('data/body/body_%s'%repo_name)	
    np.save('./data/body/body_%s/bodies_array.npy'%repo_name,np.array(bodies))

def gen_comment_array(repo_name):

    methods = np.load('../Code_RNN/method_vector/methods_%s.npy'%repo_name)
    print 'shape of method vectors',methods.shape

    method_indexes =np.load('../Code_RNN/method_vector/methods_%s_indexes.npy'%repo_name)
    print 'shape of method indexes',method_indexes.shape

    wordToIndex, indexToWord = reader._read_comments_word('./data/comment_words/commentWordMap.txt')

    methodComments,maxLength = reader._read_comments('../Code_RNN/comment_data/methodCommentMap.txt',wordToIndex)

    #print methodComments

    comments = []
    comments_index = []
    commented_method_vector = []

    _maxLength = 100

    for (index,one_comment) in methodComments.items():

	if not int(index) in method_indexes:
	    continue

	one_length = len(one_comment)
	new_comment = []
	for i in range(_maxLength+num_steps):
	    #new_comment.append(int(one_comment[i%one_length]))
	    if i < one_length:
		new_comment.append(int(one_comment[i]))
	    else:
		new_comment.append(int(wordToIndex['</s>']))
    	comments.append(new_comment)

	#print new_comment

	commented_method_vector.append(methods[np.where(method_indexes==int(index))[0][0]])

    if not os.path.exists('data/comment_%s_data'%repo_name):
        os.makedirs('data/comment_%s_data'%repo_name)	
    commented_method_vector = np.array(commented_method_vector)
    comments = np.array(comments)
    comments_index = np.array(comments_index)
    np.save('./data/comment_%s_data/comment_method_vector.npy'%repo_name,commented_method_vector)
    np.save('./data/comment_%s_data/comment_array.npy'%repo_name,comments)
    np.save('./data/comment_%s_data/comment_index.npy'%repo_name,comments_index)
    print 'save comment array successful'

    return comments

if __name__ == '__main__':

    repo_name = sys.argv[1]
    gen_comment_array(repo_name)
    gen_body_array(repo_name)

