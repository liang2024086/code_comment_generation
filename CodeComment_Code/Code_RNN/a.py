import numpy as np

import partial_tree

if __name__ == '__main__':

    which_cluster = np.array(partial_tree.gen_raw_method_cluster('./data/methodMap.txt'))
    print which_cluster

    a0 = np.where(which_cluster == 0)[0]
    a1 = np.where(which_cluster == 1)[0]
    a2 = np.where(which_cluster == 2)[0]
    a3 = np.where(which_cluster == 3)[0]
    a4 = np.where(which_cluster == 4)[0]
    a5 = np.where(which_cluster == 5)[0]
    a6 = np.where(which_cluster == 6)[0]
    a7 = np.where(which_cluster == 7)[0]
    a8 = np.where(which_cluster == 8)[0]
    a9 = np.where(which_cluster == 9)[0]

    c = a0[0]
    for i in range(10):
	c = np.append(c,a0[i])
	c = np.append(c,a1[i])
	c = np.append(c,a2[i])
	c = np.append(c,a3[i])
	c = np.append(c,a4[i])
	c = np.append(c,a5[i])
	c = np.append(c,a6[i])
	c = np.append(c,a7[i])
	c = np.append(c,a8[i])
	c = np.append(c,a9[i])
	
    b = np.concatenate((a0,a1,a2,a3,a4,a5,a6,a7,a8,a9), axis=0)
    print b
    print which_cluster[b]

    print c[1:]
    print which_cluster[c[1:]]
