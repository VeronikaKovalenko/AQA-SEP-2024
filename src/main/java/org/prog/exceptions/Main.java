package org.prog.exceptions;

import static org.prog.exceptions.ExceptionsHomework.countLinesInFile;

public class Main {
    public static void main(String[] args) {
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

        countLinesInFile("example.txt");
    }

}