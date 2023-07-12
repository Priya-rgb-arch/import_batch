#!/bin/bash

# Change to the directory where your Java program is located
cd C:/Users/ARANKHAM/Downloads/ImportFDBFile/ImportFDBFile/FDBImporter

# Set the Java classpath and the FDB file path
CLASSPATH="C:/Users/ARANKHAM/Downloads/ImportFDBFile/ImportFDBFile/target/ImportFDBFile-0.0.1-SNAPSHOT.jar"
FDB_FILE="C:/Users/ARANKHAM/OneDrive - Capgemini/Desktop/Batch_Jobs Files/FDB Daily price updates.csv"

# Compile and run the Java program to push changes to store database
javac FDBImporter.java
java FDBImporter
