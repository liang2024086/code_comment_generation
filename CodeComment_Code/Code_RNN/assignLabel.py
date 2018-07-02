import numpy as np
import tensorflow as tf
import random
import math


def calF1(matrix):

    all_labels = []
    for i in range(6):
	ass = [ 0 for t in range(6)]
	ass[i] = 1
	for j in range(6):
	    if ass[j] == 1:
		continue
	    ass[j] = 1
	    for m in range(6):
		if ass[m] == 1:
		    continue
		ass[m] = 1
		for n in range(6):
		    if ass[n] == 1:
			continue
		    ass[n] = 1
		    for o in range(6):
			if ass[o] == 1:
			    continue
			ass[o] = 1
			for p in range(6):
			    if ass[p] == 1:
				continue
			    ass[p] = 1
			    all_labels.append([i,j,m,n,o,p])
			    ass[p] = 0
			ass[o] = 0
		    ass[n] = 0
		ass[m] = 0
	    ass[j] = 0
	ass[i] = 0

    print len(all_labels),len(all_labels[0])

    if True:
	if True:
	    if True:
		print matrix

		rate = [ [0 for k in range(6)] for j in range(6)]

		for o in range(6):
		    tmp_sum = matrix[o][0]+matrix[o][1]+matrix[o][2]+matrix[o][3]+matrix[o][4]+matrix[o][5]
		
		    if tmp_sum == 0:
		        for p in range(6):
			    rate[o][p] = 0
		    else:
		        for p in range(6):
			    rate[o][p] = float(matrix[o][p]) / tmp_sum

		print 'rate', rate

		label_num = [ 0 for k in range(6) ]
		methods_num = 0
                for o in range(6):
                    sum_ = 0
                    for k in range(6):
                        sum_ += matrix[k][o]
		    methods_num += sum_
                    label_num[o] = sum_

		print label_num
		print methods_num

		accuracy = 0
		label = 0
	    	for one_label in all_labels:
		    tmp_accuracy = 0
		    for i in range(len(matrix)):
			tmp_accuracy += matrix[i][one_label[i]]
		    tmp_accuracy = float(tmp_accuracy) / methods_num
		    if tmp_accuracy > accuracy:
			accuracy = tmp_accuracy
			label = one_label

		print 'best accuracy',accuracy
		print 'final label',label

		precision = [ -1 for k in range(6) ]
		recall = [ -1 for k in range(6) ]
		F1 = [-1 for k in range(6)]
		for o in range(6): 
		    tmp_sum = matrix[o][0]+matrix[o][1]+matrix[o][2]+matrix[o][3]+matrix[o][4]+matrix[o][5]
		    if tmp_sum == 0:
			precision[o] = 0
			recall[o] = 0
			F1[o] = 0
		    else:
		        precision[o] = float(matrix[o][label[o]]) / tmp_sum
			recall[o] = float(matrix[o][label[o]]) / label_num[label[o]]
			if precision[o] == 0 or recall[o] == 0:
                            F1[o] = 0
                        else:
                            F1[o] = (2*precision[o]*recall[o]) / (precision[o] + recall[o])



		print 'precision',precision
		print 'recall',recall
		print 'F1',F1

		average_f1 = 0
		for f1 in F1:
		    average_f1 += f1
		print 'average F1',average_f1 / 6


if __name__ == '__main__':

    print 1
