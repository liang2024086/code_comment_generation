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

REPO=$1 #cocos2d
train_index=$2 # 1000 1040 1181
val_index=$3
test_index=$4
epoch_num=$5

genData ${REPO} ../../CodeComment_Data/Github/${REPO}/

echo ""
echo "generate method vector"
cd Code_RNN
if [ ! -d "comment_data/" ]; then
    mkdir comment_data
fi
cp ../GetParseTree/output/* comment_data/
python gen_data.py comment
echo "-- generating"
python gen_vector.py ${REPO}
cd ..

cd Code_GRU
if [ ! -d "data/" ]; then
    mkdir data
fi

echo "prepare for calculating ROUGE-2 value"
if [ ! -d "rouge_data/" ]; then
    mkdir rouge_data
fi
if [ ! -d "rouge_data/model_summaries" ]; then
    mkdir rouge_data/model_summaries
fi
if [ ! -d "rouge_data/system_summaries" ]; then
    mkdir rouge_data/system_summaries
fi

echo "generate body word"
python gen_body_word_with_unk.py
echo "generate comment word"
python gen_comment_word_with_unk.py
python gen_comment_data.py ${REPO}

rm -rf rouge_data/model_summaries/*
rm -rf rouge_data/system_summaries/*

echo "begin to train"
python train.py ${REPO} ${train_index} ${val_index} ${epoch_num}

echo "begin to test"
rm -rf rouge_data/model_summaries/*
rm -rf rouge_data/system_summaries/*
python beam_eval.py ${REPO} ${train_index} ${val_index} ${test_index}
cd .. 



