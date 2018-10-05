import numpy as np
import tensorflow as tf
import random

from CustomRNNCell import CustomRNNCell

def reset_graph():
#    if 'sess' in globals() and sess:
#        sess.close()
    tf.reset_default_graph()

def build_graph(batch_size, state_size, learning_rate, node_type_size,vector_size,level_max_width,parse_tree_depth,num_classes):

    reset_graph()

    '''
    Placeholders
    '''

    x = tf.placeholder(tf.int32,[batch_size,parse_tree_depth,level_max_width,2], name = 'input_holder')
#    x = tf.placeholder(tf.int32,[num_steps,batch_size, num_leaf_node,3], name = 'input_holder')
    x_1 = tf.placeholder(tf.float32,[batch_size,parse_tree_depth,level_max_width], name = 'input_holder')
    print 'shape of input',x.get_shape()

    y = tf.placeholder(tf.int32,[batch_size], name = 'target_holder')

    """
    RNN Inputs
    """

    # Turn our x placeholder into a list of one-hot tensors:
    # rnn_inputs is a list of num_steps tensors with shape [batch_size, num_classes]
#    x_one_hot = tf.one_hot(x, num_classes)
#    rnn_inputs = tf.unpack(x_one_hot, axis=1)
#    rnn_inputs = tf.unpack(x,axis=0)

    with tf.variable_scope('TreeRnn'):
        '''
	shape: node_type_size X vector_size X vector_size since there is a matrix for every internal node
        '''
#        W_node = tf.get_variable('W_node',[node_type_size,vector_size],initializer=tf.random_uniform_initializer(minval=-1.0,maxval=1.0,seed=random.seed()))
        W_node = tf.get_variable('W_node',[node_type_size,vector_size],initializer=tf.random_normal_initializer(mean=0.0,stddev=0.1,seed=random.seed()))
#        W_node = tf.get_variable('W_node',[node_type_size,vector_size])
	print 'W node',W_node.get_shape()

        '''
	weight of parent node and children node
        '''
#        W_child = tf.get_variable('W_child',[vector_size,vector_size],initializer=tf.random_uniform_initializer(minval=0.0,maxval=1.0,seed=random.seed()))
        W_child = tf.get_variable('W_child',[vector_size,vector_size],initializer=tf.random_normal_initializer(mean=0.0,stddev=0.1,seed=random.seed()))
#        W_child = tf.get_variable('W_child',[vector_size,vector_size])
	print 'W child',W_child.get_shape()

	'''
	bias of parent node and children node
	'''
	b_child = tf.get_variable('b_child',[vector_size],initializer=tf.random_normal_initializer(mean=0.0,stddev=0.1,seed=random.seed()))
	print 'b child',b_child.get_shape()

    print 'mode tree depht',parse_tree_depth
    cell = CustomRNNCell(state_size,node_type_size,vector_size,batch_size,parse_tree_depth,level_max_width,W_node,W_child,b_child)
    #train_trees = tf.expand_dims(tf.contrib.layers.unit_norm(cell.__call__(x,x_1,x_num_sub_trees),1),1)
    train_trees = cell.__call__(x,x_1)
    #print 'train trees',train_trees.get_shape()

    _node_rep,_abc_ = cell.get_node_rep()
    final_tree_vector = cell.get_final_tree_vector()

    with tf.variable_scope('softmax'):
        W = tf.get_variable('W', [vector_size, num_classes])
        b = tf.get_variable('b', [num_classes])
	print 'W softmax',W.get_shape()
	print 'b softmax',b.get_shape()

    logits = tf.matmul(train_trees,W) + b

    output = tf.nn.softmax(logits)

    l2_loss = tf.nn.l2_loss(W_node) + tf.nn.l2_loss(W_child)#0.001 * l2_loss +
    total_loss =  tf.reduce_sum(tf.nn.sparse_softmax_cross_entropy_with_logits(labels=y,logits=logits))
    #print 'loss',total_loss.get_shape()


    train_step = tf.train.AdagradOptimizer(learning_rate).minimize(total_loss)

    return dict(x=x,x_1=x_1,y=y,train_trees=train_trees,total_loss=total_loss,train_step=train_step,saver=tf.train.Saver(),W_node=W_node,W_child=W_child,_node_rep=_node_rep,final_tree_vector=final_tree_vector,_abc_=_abc_,output=output,l2=l2_loss)

def generate_text(g,checkpoint,num_words,prompt=23,pick_top_words=None):

    with tf.Session() as sess:
        sess.run(tf.global_variables_initializer())
        g['saver'].restore(sess,checkpoint)

        state = None
        current_word = prompt
        words = [current_word]

        for i in range(num_words):
            if state is not None:
                feed_dict={g['x']:[[current_word]],g['init_state']:state}
            else:
                feed_dict={g['x']:[[current_word]]}

            preds, state = sess.run([g['preds'],g['final_state']],feed_dict)
	
            if pick_top_words is not None:
                p = np.squeeze(preds)
                p[np.argsort(p)[:-pick_top_words]] = 0
                p = p / np.sum(p)
                current_word = np.random.choice(298,1,p=p)[0]
            else:
                current_word = np.random.choice(298,1,p=np.squeeze(preds))[0]

            words.append(current_word)
    
    wordToIndex,indexToWord = reader._read_comments_word('data/commentWordMap.txt')

    rawWords = []
    for word in words:
        rawWords.append(indexToWord['%d'%word])
    return rawWords

