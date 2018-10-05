#!/bin/bash

genData(){
    # project name
    REPO=$1

    # path for project's source codes
    SRC=$2  

    # generate call graph among classes
    echo ""
    echo "begin to generate method map"
    cd GenClassCallGraph
    if [ ! -d "data/" ]; then
        mkdir data
    fi
    find $SRC -name *.java > data/${REPO}JavaFile.txt
    find ./src -name *.java > javaFile.txt
    if [ ! -d "map/" ]; then
        mkdir map
    fi
    javac -d . -cp .:./mylib/* @javaFile.txt
    java -cp .:./mylib/* adapt.codeMining.javaParser.callGraph.CallGraphGenerator ${REPO}
    cd ..

    # generate parse trees for all methods
    echo ""
    echo "begin to generate parse tree"
    cd GetParseTree
    echo repoNames=${REPO} > param.properties
    if [ ! -d "data/" ]; then
        mkdir data
    fi
    find $SRC -name *.java > data/${REPO}JavaFile.txt
    if [ ! -d "output/" ]; then
        mkdir output
    fi
    find ./src -name *.java > javaFile.txt
    javac -d . -cp .:./mylib/* @javaFile.txt
    java -cp .:./mylib/* parseTree.Main ${REPO}
    cd ..
}

#genData train ../../CodeComment_Data/Code_Jam/train/

# train the Code RNN (parse tree)
#echo ""
#echo "begin to train Code RNN"

#echo "-- begin to generate data for training"
#cd Code_RNN
#if [ ! -d "data/" ]; then
#    mkdir data
#fi
#cp ../GetParseTree/output/* data/
#python gen_data.py train
#cd ..

genData val ../../CodeComment_Data/Code_Jam/val/

# train the Code RNN (parse tree)

echo "begin to generate data for val"
cd Code_RNN
if [ ! -d "val_data/" ]; then
    mkdir val_data
fi
cp ../GetParseTree/output/* val_data/
python gen_data.py val
echo "-- begin to validation"
python eval.py val
cd ..



