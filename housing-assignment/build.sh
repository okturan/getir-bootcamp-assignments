#!/bin/bash

# Set project directory
PROJECTDIR="./"

# Create directories if they don't exist
mkdir -p $PROJECTDIR/src $PROJECTDIR/bin

# Clean bin directory
rm -rf $PROJECTDIR/bin/*

# Compile all Java files from src to bin (including subdirectories)
find $PROJECTDIR/src -name "*.java" | xargs javac -d $PROJECTDIR/bin

# Run the program with fully qualified main class name
java -cp $PROJECTDIR/bin com.housingapp.Main
