package exercises.exercise_15;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Write an example that counts the number of times a particular character, such as e, appears in a file.
 * The character can be specified at the command line. You can use example.txt as the input file.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter character: ");
        char characterToFind = scanner.next().charAt(0);

        int counter = 0;

        try (InputStream inputStream = new FileInputStream("files/myfile")) {
            for (int byteFromFile; (byteFromFile = inputStream.read()) > 0; ) {
                char charFromByte = (char) byteFromFile;
                if (charFromByte == characterToFind) {
                    counter++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.printf("Found %d character(s) %c in file.", counter, characterToFind);
    }
}
