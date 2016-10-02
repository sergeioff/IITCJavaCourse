package introductionToJavaProgramming;

import javax.swing.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Display the current time in the title of a frame window using this format: 12:45:43 PM.
 */

public class Task5 {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        String time = currentTime.format(DateTimeFormatter.ofPattern("h:mm:ss a"));

        JFrame frame = new JFrame(time);
        frame.setBounds(100, 100, 300, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
