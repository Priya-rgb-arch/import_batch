package com.fdb;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FDBImporter {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java FDBImporter <filename>");
            return;
        }
        
        String filename = args[0];
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Process each line of the file here
                // You can parse and import the data into your financial database
                System.out.println("Importing line: " + line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
