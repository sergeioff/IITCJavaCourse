package javaProgrammingBasics;

import java.util.Scanner;

public class Task24 {
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

        for (int i = 0; i < words.length; i++) {
            StringBuilder wordBuilder = new StringBuilder(words[i]);
            words[i] = wordBuilder.reverse().toString();

            stringBuilder.append(words[i]).append(" ");
        }

        stringBuilder.deleteCharAt(stringBuilder.length() - 1);

        return stringBuilder.toString();
    }
}
