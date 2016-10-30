package coreJava.task8;

import java.util.ArrayList;
import java.util.Random;

/**
 * @see Task8
 */
public class Fortune {
    private ArrayList<String> fortunes;

    {
        fortunes = new ArrayList<>();
        fortunes.add("You will qet 4.0 GPA this semester.");
        fortunes.add("Happiness is programming.");
        fortunes.add("Satisfaction follows hard work.");
        fortunes.add("Patience is virtue.");
        fortunes.add("Tomorrow you'll be fine");
        fortunes.add("Java is happiness");
        fortunes.add("You will qet 5.0 GPA this semester.");
        fortunes.add("Tomorrow you'll be happy");
        fortunes.add("Next week will be good");
        fortunes.add("Some fortune :)");
    }

    String getRandomFortune() {
        Random random = new Random();
        return fortunes.get(random.nextInt(fortunes.size()));
    }
}
