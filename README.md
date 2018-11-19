# Code Comment Generation

Code and data for paper: [Automatic Generation of Text Descriptive Comments for Code Blocks](https://www.aaai.org/ocs/index.php/AAAI/AAAI18/paper/view/16492/16072).

## Resources
Libraries: tensorflow 1.3; numpy; python2.7

Put the Code Jam data in folder CodeComment_Data/Code_Jam

Put the github code data in folder CodeComment_Data/Github

You can change the command in the file run.sh to run different data set.

## There are the template commands:

### To train the Code-RNN:
```
CodeComment_Code/run_code_rnn.sh {MAX_TERMINATE_ITERATION_NUMBERS_OF_NOT_INCREASE}
```
For example, if we want to terminate the training process when the results of validation sets is not increased in five steps, we can write the command as:
```
CodeComment_Code/run_code_rnn.sh 5
```
### To train the Code-GRU:
```
CodeComment_Code/run_code_gru.sh {PROJECT_NAME} {TRAIN_SET_INDEX} {VALIDATION_SET_INDEX} {TEST_SET_INDEX} {EPOCH_NUMBER}
```
For example, project cocos2d totally has 1181 commented methods, we split them into three date sets. The training set is from index 0 to 999, the validation set is from index 1000 to 1039 and the test set is from index 1040 to 1180. The command is:
```
CodeComment_Code/run_code_gru.sh cocos2d 1000 1040 1181 800
```
#### Parameters of ten projects
Activiti 900 940 1071 800
aima-java 1000 1027 1127 800
neo4j 1000 1040 1197 800
cocos2d 1000 1040 1181 800
rhino 1000 1040 1187 800
spring-batch 1600 1650 1827 800
Smack 2100 2180 2342 800
guava 2300 2370 2530 800
jersey 2300 2350 2539 800
libgdx 2600 2650 2823 800

### Run the demo
Put the source code of cocos2d into the folder CodeComment_Data/Github/cocos2d then run the run.sh file directly. 

### Training data for code comment generation
Search these ten projects in the github then put their source codes in the related folders. The name of projects is the folder name in the ./CodeComment_Data/Github.

