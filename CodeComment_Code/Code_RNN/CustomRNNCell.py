import tensorflow as tf

from tensorflow.python.ops import variable_scope as vs

from tensorflow.python.ops.math_ops import tanh


class CustomRNNCell():

    def __init__(self, num_units,node_type_size,vector_size,batch_size,parse_tree_depth,level_max_width,W_node,W_child,b_child,input_size=None, activation=tanh):
        if input_size is not None:
            logging.warn("%s: The input_size parameter is deprecated.", self)
        self._num_units = num_units
        self._activation = activation
        self._vector_size = vector_size
        self._batch_size = batch_size
        self._tree_depth = parse_tree_depth
        self._node_type_size = node_type_size
        self._level_max_width = level_max_width
	#self._max_num_sub_tree = max_num_sub_tree
	self.W_node = W_node
        self.W_child = W_child
	self.b_child = b_child
            
        self.my_zeros_matrix = tf.zeros([1,self._vector_size])

	self.final_tree_vector = 0
	self._original_inter_node_vector = 0

	self.W = 0
	self.b = 0
	self.W_inter = 0
	self.W_identifier = 0

	self._node_rep = 0

        self.abc = 0

    @property
    def state_size(self):
        return self._num_units

    @property
    def output_size(self):
        return self._num_units

    def set_batch_size(self,size):
        self._batch_size = size

    def get_node_rep(self):
	return self._node_rep,self.abc

    def get_inter_input_weight(self):
        return self.input_weight

    def get_final_tree_vector(self):
        return self.final_tree_vector

    def get_original_inter_node_vector(self):
 	return self._original_inter_node_vector

    def get_parameter(self):
	return self.W_node,self.W,self.b,self.W_inter,self.W_identifier

    def __call__(self, inputs,input_division, scope=None):
        with vs.variable_scope(scope or type(self).__name__):
#	    output = self._activation(tf.nn.rnn_cell._linear([inputs, state], self._num_units, True))

	    # split inputs into leaf nodes and inter nodes
            #leaf_input = inputs[:,0:self._num_leaf_node]
            #inter_input = inputs[:,self._num_leaf_node:]

	    #print 'shape of weight',self.W_node.get_shape(), self.W_child.get_shape()


	    '''
		fill the weight matirx to make some nodes always zero
            '''
            W_node_new = tf.concat(axis=0,values=[self.W_node,self.my_zeros_matrix])
	    #print 'shape of new weight matrix',W_node_new.get_shape()

            vector_ones = tf.ones([self._batch_size,1,self._vector_size])

	    #print 'depth of tree',self._tree_depth
	   
	    '''
		get the vector representation of every node
            ''' 
	    node_vector = tf.matmul(tf.reshape(tf.one_hot(inputs[:,:,:,1],self._node_type_size+1),[-1,self._node_type_size+1]),W_node_new)
	    node_vector = tf.reshape(node_vector,[self._batch_size,self._tree_depth,self._level_max_width,self._vector_size])
	    #print 'shape of node vector',node_vector.get_shape()

	    '''
		get the one-hot representation of every node's father index
            '''
	    node_father = tf.one_hot(inputs[:,:,:,0],self._level_max_width)
	    #print 'shape of node father',node_father.get_shape()

	    '''
		the transpose of node's father matrix is the matrix of father's children
		for example:
		node father is:
		[ [1 0 0 0]
		  [0 1 0 0]
		  [0 0 1 0]
		  [0 1 0 0] ]

		then for fathers, their children matrix is:
		[ [1 0 0 0]
		  [0 1 0 1]
		  [0 0 1 0]
		  [0 0 0 0] ]
	    '''
	    node_children = tf.transpose(node_father,perm=[0,1,3,2])
	    #print 'shape of node children',node_children.get_shape()

	    '''
		calculate 1/x element-wise
	    '''
	    node_division = tf.concat(axis=3,values=[tf.expand_dims(input_division,3) for i in range(self._vector_size)])
	    #print 'shape of node division',node_division.get_shape(),node_division

	    node_representation_cal = node_vector[:,self._tree_depth-1,:,:]
	    #print 'shpae of node representation cal',node_representation_cal.get_shape()
	    for i in range(self._tree_depth-2,-1,-1):
		'''
		node_children[:,:,i+1,:,:]  contains the children information of the nodes in level i
		'''
		children_representation = tf.matmul(node_children[:,i+1,:,:],node_representation_cal)
		#print 'shape of children rep',children_representation.get_shape()

		children_representation = tf.matmul(tf.reshape(children_representation,[-1,self._vector_size]),self.W_child)
		#print 'shpae of reshape children',children_representation.get_shape()

		children_representation = tf.add(tf.multiply(tf.reshape(children_representation,[self._batch_size,self._level_max_width,self._vector_size]),node_division[:,i,:,:]),self.b_child)
		#children_representation = tf.add(tf.reshape(children_representation,[self._batch_size,self._level_max_width,self._vector_size]),self.b_child)
		#print 'shpae of reshape children2',children_representation.get_shape()

		if i == 0:
		    #node_representation_cal = tf.add(node_vector[:,i,:,:],children_representation)
		    node_representation_cal = tf.add(node_vector[:,i,:,:],tf.nn.relu(children_representation))
		else:
		    node_representation_cal = tf.add(node_vector[:,i,:,:],tf.nn.relu(children_representation))
		    #node_representation_cal = tf.nn.relu(tf.add(node_vector[:,i,:,:],children_representation))

		#print 'shape of inter node',node_representation_cal.get_shape()


	    self.final_tree_vector = node_representation_cal[:,0,:]
	    #print 'shape of final tree vector',self.final_tree_vector.get_shape()

            '''
	    weight and bias for RNN
	    
            self.W = tf.get_variable('W',[self._vector_size + self._num_units,self._num_units])
            self.b = tf.get_variable('b',[self._num_units],initializer=tf.constant_initializer(0.0))

            output = self._activation(tf.matmul(tf.concat(1,[self.final_tree_vector,state]),self.W)+self.b)
	    
        return output, output
	    '''
	return self.final_tree_vector
