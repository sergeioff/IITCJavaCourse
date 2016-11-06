package exercises.exercise_15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Write a program that will count the number of lines in each file that is specified on the command line.
 * Assume that the files are text files. Note that multiple files can be specified,
 * as in "java LineCounts file1.txt file2.txt file3.txt". Write each file name,
 * along with the number of lines in that file, to standard output.
 * If an error occurs while trying to read from one of the files, you should print an error message
 * for that file, but you should still process all the remaining files.
 */
public class Task2 {
    public static void main(String[] args) {
        for (String filename : args) {
            try (BufferedReader fileReader = new BufferedReader(new FileReader(filename))) {
                int linesCount = 0;
                for (String line; (line = fileReader.readLine()) != null; ) {
                    linesCount++;
                }
                System.out.printf("There are %d lines in %s\n", linesCount, filename);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
