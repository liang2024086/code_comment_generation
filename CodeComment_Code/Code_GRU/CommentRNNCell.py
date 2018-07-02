import tensorflow as tf

from tensorflow.python.ops import variable_scope as vs

from tensorflow.python.ops.math_ops import tanh


#class CommentRNNCell(tf.nn.rnn_cell.RNNCell):
class CommentRNNCell(tf.contrib.rnn.RNNCell):

    def __init__(self, num_units,method_vectors, vector_size, num_classes, W_rnn, b_rnn, W_z,W_r,W_c,activation=tanh):

	self._num_units = num_units
	self._method_vectors = method_vectors
	self._vector_size = vector_size
	self._activation = activation
	self._num_classes = num_classes
	self.W = W_rnn
	self.b = b_rnn
	self.W_z = W_z
	self.W_r = W_r
	self.W_c = W_c

    @property
    def state_size(self):
        return self._num_units

    @property
    def output_size(self):
        return self._num_units


    def __call__(self, inputs, state, scope=None):
        with vs.variable_scope(scope or type(self).__name__):

	    #print self.W_z.get_shape(),self.W_r.get_shape(),self.W_c.get_shape()


	    z = tf.nn.sigmoid(tf.matmul(tf.concat(axis=1,values=[state,inputs]),self.W_z))
	    #print 'shape of z',z.get_shape()

	    r = tf.nn.sigmoid(tf.matmul(tf.concat(axis=1,values=[state,inputs]),self.W_r))
	    #print 'shape of r',r.get_shape()

	    c = tf.nn.sigmoid(tf.matmul(tf.concat(axis=1,values=[state,inputs]),self.W_c))
	    #print 'shape of c',c.get_shape()

	    _state = self._activation(tf.matmul(tf.concat(axis=1,values=[r*state,
		    c*self._method_vectors,
		    inputs]),self.W))
	    #print 'shape of _state',_state.get_shape()

	    output = (1-z)*state + z*_state

	    '''
            output = self._activation(tf.matmul(tf.concat(axis=1,values=[inputs,
	    self._method_vectors,
	    state]),self.W)+self.b)
	    '''
	    #print 'shape of output',output.get_shape()
        return output, output
