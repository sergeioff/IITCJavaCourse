package javaProgrammingBasics;

import java.util.Scanner;

/**
 * Improve the program in Exercise 24 by removing the assumptions. For example, an input sentence could be
 Hello, how are you? I use JDK 1.2.2.   Bye-bye.
 An input sentence may contain punctuation marks and more than one blank space between two words. Transposing the above will result in
 olleH, woh era uoy? I esu KDJ 1.2.2. eyB-eyb.
 */
public class Task26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine;

        do {
            System.out.println("Enter a line:");
            inputLine = scanner.nextLine();

            if (inputLine.length() == 0) {
                System.out.println("Bye!");
                return;
            }

            System.out.println(transform(inputLine));
        } while (inputLine.length() > 0);
    }

    private static String transform(String line) {
        StringBuilder stringBuilder = new StringBuilder(line.length());

        String[] words = line.split(" ");

        for (String word : words) {
            int wordLength = word.length();

            StringBuilder wordBuilder = new StringBuilder(wordLength);
            StringBuilder letterSequence = new StringBuilder();

            for (int j = 0; j < wordLength; j++) {
                char currentChar = word.charAt(j);
                if (Character.isLetter(currentChar)) {
                    letterSequence.append(currentChar);
                } else {
                    wordBuilder.append(letterSequence.reverse());
                    letterSequence = new StringBuilder();

                    wordBuilder.append(currentChar);
                }
            }

            wordBuilder.append(letterSequence.reverse());

            stringBuilder.append(wordBuilder).append(" ");
        }

        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }
}
