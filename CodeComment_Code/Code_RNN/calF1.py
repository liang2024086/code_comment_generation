import numpy as np
import tensorflow as tf
import random
import math


def calF1(matrix):

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

		wether_label = [ -1 for k in range(6) ]
		wether_allign = [-1 for k in range(6) ]

		label = [ -1 for k in range(6) ]
		own_rate = [ -1 for k in range(6)]

		while True:
		#for adf in range(3):
		    judge = True
		    for o in range(6):
			if wether_label[o] != 1:
			    judge = False
		    if judge:
			break

		    for o in range(6):
			if label[o] != -1:
			    continue

		        max_rate = -1
		        cluster_index = -1
		        for p in range(6):
			    if rate[o][p] > max_rate and wether_allign[p] != 1:
			        max_rate = rate[o][p]
			        cluster_index = p
		        #print o,p,'adsf',max_rate,cluster_index
		        label[o] = cluster_index
		        own_rate[o] = max_rate

		    #print label
		    #print own_rate

		    need_label = []
		    for o in range(6):
		        if wether_label[o] != -1:
			    continue

		        same_label = [o]
		        for p in range(o+1,6):
			    if label[p] == label[o]:
			        wether_label[o] = 0
			        wether_label[p] = 0
			        same_label.append(p)
		        if wether_label[o] == -1:
			    wether_label[o] = 1
			    wether_allign[label[o]] = 1
		        else:
			    need_label.append(same_label)

		    #print 'wether label',wether_label
		    #print 'wether allign',wether_allign
		    #print 'nedd',need_label

		    need_relabel = []
		    for same_labeled_cluster in need_label:
			max_index = 0
			max_rate = -1
			for a_index in range(len(same_labeled_cluster)):
			    #print 'need to relable index and now label',same_labeled_cluster[a_index],label[same_labeled_cluster[a_index]]
			    
			    if own_rate[same_labeled_cluster[a_index]] > max_rate:
				max_index = same_labeled_cluster[a_index]
				max_rate = own_rate[same_labeled_cluster[a_index]]

			#print max_index,max_rate
			wether_label[max_index] = 1
			wether_allign[label[max_index]] = 1

			for a_index in range(len(same_labeled_cluster)):
			    if same_labeled_cluster[a_index] != max_index:
				label[same_labeled_cluster[a_index]] = -1
				own_rate[same_labeled_cluster[a_index]] = -1
				wether_label[same_labeled_cluster[a_index]] = -1
				need_relabel.append(same_labeled_cluster[a_index])

    # 	    print 'accuracy',accuracy_array
		print label
		print matrix


		label_num = [ 0 for k in range(6) ]
		for o in range(6):
		    sum_ = 0
		    for k in range(6):
			sum_ += matrix[k][o]
		    label_num[o] = sum_

		print 'label',label
		print 'label num',label_num

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
