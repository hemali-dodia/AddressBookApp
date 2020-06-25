#!/bin/bash

function CompileJavaFiles()
{
	javac -d ./classes/ -cp ./classes/ $1
}

for javafile in `find . -type f -name "*.java"`
do
	echo $javafile
	CompileJavaFiles $javafile
done
