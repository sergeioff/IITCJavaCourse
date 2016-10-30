package coreJava.task8;

import java.util.Scanner;

/**
  *  Using a list (either an ArrayList or a LinkedList), write a fortune telling program.
  *  Repeatedly prompt the user with the message Fortune (y/N)?
  *  If the user enters Y, then display a randomly selected fortune from the list.
  *  If the user enters N, then stop the program.
  *  Deﬁne the class named Fortune.
  *  You can deﬁne and use a separate main class or include the main method in the Fortune class.
  *  Create the fortune list in the constructor. Include at least 10 fortunes.
  *  The following are sample fortunes you can use:
  *  You will qet 4.0 GPA this semester.
  *  Happiness is programming.
  *  Satisfaction follows hard work.
  *  Patience is virtue.
  */
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fortune fortune = new Fortune();

        String userInput;

        do {
            System.out.println("Fortune (y/n)?");
            userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("Y")) {
                System.out.println(fortune.getRandomFortune());
            }
        } while (!userInput.equalsIgnoreCase("N"));
    }
}
