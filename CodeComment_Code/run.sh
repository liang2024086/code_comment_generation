#!/bin/bash

# project name
REPO=zxing   

# path for project's source codes
SRC=/home/yuding/workspace/DATA/zxing/  

echo $REPO

# generate call graph among classes
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
