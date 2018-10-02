import tensorflow as tf
import numpy as np
import sys

from partial_tree import gen_raw_method_cluster
from partial_tree import _read_parse_tree
from partial_tree import gen_parse_tree_matrix
import train

if __name__ == '__main__':

    folder = ''
    if sys.argv[1] == 'train':
        folder = 'data'
    elif sys.argv[1] == 'test':
        folder = 'test_data'
    elif sys.argv[1] == 'val':
        folder = 'val_data'
    elif sys.argv[1] == 'comment':
        folder = 'comment_data'

    print "load parse tree"
    parseTree, maxLength, parse_tree_depth1, parse_tree_width = _read_parse_tree(folder+'/parseTree.txt')
    #print ('maximum number of nodes',maxLength)
    #print ('max depth of trees',parse_tree_depth1)
    #print ('max num of leaf nodes',parse_tree_width)
    #print 'num of parse trees', len(parseTree)

    print "tranfer parse tree to matirx"
    partial_trees,node_type_size,level_width,method_indexes = gen_parse_tree_matrix(parseTree,parse_tree_depth1,parse_tree_width,0)

    #print 'num of tress',len(partial_trees)
    #print 'node type size:',node_type_size
    #print 'max width of every level:',level_width

    train.save_data(folder,partial_trees,node_type_size,level_width,method_indexes,parse_tree_depth1)

    if sys.argv[1] == 'train' or sys.argv[1] == 'test':
        if sys.argv[1] == 'train':
            which_cluster, cluster_name_to_index  = np.array(gen_raw_method_cluster('./data/methodMap.txt',6648))
        elif sys.argv[1] == 'test':
            which_cluster, cluster_name_to_index  = np.array(gen_raw_method_cluster('./test_data/methodMap.txt',30))
        data_file = open('./data/cluster.txt','w')
        try:
            for (name,index) in cluster_name_to_index.items():
                data_file.write('%s,%d\n'%(name,index))
        finally:
            data_file.close()


