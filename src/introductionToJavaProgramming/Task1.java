package introductionToJavaProgramming;

/**
 * For each of these expressions, determine its result. Assume the value of text is a string Java Programming.
 * String text = "Java Programming";
 * a. text.substring(0, 4) 							                        // “Java”
 * b. text.length()		                            						// 16
 * c. text.substring(8, 12) 							                    // “gram”
 * d. text.substring(0, 1) + text.substring(7, 9) 			            	// “Jog”
 * e. text.substring(5,6) + text.substring(text.length()-3, text.length()) 	// “Ping”
 */

public class Task1 {
    public static void main(String[] args) {
        String text = "Java Programming";
        System.out.println(text.substring(0, 4));
        System.out.println(text.length());
        System.out.println(text.substring(8, 12));
        System.out.println(text.substring(0, 1) + text.substring(7, 9));
        System.out.println(text.substring(5, 6) + text.substring(text.length() - 3,
                text.length()));
    }
}
