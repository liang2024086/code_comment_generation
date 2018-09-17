import tensorflow as tf
import numpy as np

def load_data(repo_name):
    
    methods_vector = np.load('./comment_%s_data/comment_method_vector.npy'%repo_name)

    return methods_vector

if __name__ == '__main__':

    repos = ['cocos2d','guice','jersey','jna','mockito','rhino','zxing']
    for repo in repos:
	method_vector = load_data(repo)
	print repo
	print method_vector.shape
	dist = 0
	count = 0
	for i in range(len(method_vector)):
	    __count = 0
	    for j in range(i,len(method_vector)):
		dist_temp= np.sqrt(np.sum(np.square(method_vector[i] - method_vector[j])))
		dist += dist_temp
		if dist_temp < 0.000001:
		    count += 2
		    __count += 1
	    #print __count,

	dividor = len(method_vector) * (len(method_vector) - 1) / 2
	length = len(method_vector)
	print dist, dist / dividor, count/float(length)
	print 
