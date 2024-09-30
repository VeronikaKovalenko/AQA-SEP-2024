package org.prog.exceptions;

import java.io.*;

//TODO: write method that will count text file lines and print it (put it in separate method)
// (you can use ChatGPT to generate this part)
// Trasnform FileNotFoundException into RuntimeException
// Catch this exception in main method call this method once for existing file
// second time for non-existing file
// print "YAY!" after file reading is done



public class ExceptionsHomework {
    public static void main(String[] args) {
        File file = new File( "C:\\Users\\Коля\\Desktop\\QA Auto\\example.txt.txt\"");

        try {
            countLinesInFile("example.txt");
        } catch (RuntimeException e) {
            System.out.println("Error processing existing file: " + e.getMessage());
        }

        try {
            countLinesInFile("nonexistent.txt");
        } catch (RuntimeException e) {
            System.out.println("Error processing non-existent file: " + e.getMessage());
        }
    }

    public static void countLinesInFile(String filename) {
        int lineCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            while (br.readLine() != null) {
                lineCount++;
            }
            System.out.println("In File '" + filename + "' " + lineCount + " lines.");
            System.out.println("YAY!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File '" + filename + "' not found.", e);
        } catch (IOException e) {
            System.out.println("Error occurred while reading the file: " + e.getMessage());
        }
    }
}

