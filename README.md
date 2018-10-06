# code_comment_generation

Code and data for paper: Automatic Generation of Text Descriptive Comments for Code Blocks.

Libraries: tensorflow 1.3 numpy python2.7

Put the Code Jam data in folder CodeComment_Data/Code_Jam

Put the github code data in folder CodeComment_Data/Github

You can change the command in the file run.sh to run different data set.

There are the template commands:

To train the Code-RNN:
CodeComment_Code/run_code_rnn.sh {MAX_TERMINATE_ITERATION_NUMBERS_OF_NOT_INCREASE}
For example, if we want to terminate the training process when the results of validation sets is not increaseed in five steps, we can write the command as:
CodeComment_Code/run_code_rnn.sh 5

To train the Code-GRU:
CodeComment_Code/run_code_gru.sh {PROJECT_NAME} {TRAIN_SET_INDEX} {VALIDATION_SET_INDEX} {TEST_SET_INDEX} {EPOCH_NUMBER}
For example, project cocos2d totally has 1181 commented methods, we split them into three date sets. The training set is from index 0 to 999, the validation set is from index 1000 to 1039 and the test set is from index 1040 to 1180. The command is:
CodeComment_Code/run_code_gru.sh cocos2d 1000 1040 1181 800

Or you can put the source code of cocos2d into the folder CodeComment_Data/Github/cocos2d then run run.sh file directly. You can run the demo in this way.

