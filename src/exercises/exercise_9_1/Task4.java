package exercises.exercise_9_1;

/**
 * 4. One entity named "one" tells with his friend "puton" and their conversation is interesting.
 * "One" can say words "out" and "output", besides he calls his friend by name.
 * "Puton" can say words "in", "input" and "one". They understand each other perfect and even
 * write dialogue in strings without spaces.
 * You have N strings. Find which of them are dialogues.
 * Input
 * In the first line of input there is one non-negative integer N ≤ 1000.
 * Next N lines contain non-empty strings. Each string consists of small Latin letters.
 * Total length of all strings is no more than 107 characters.
 * Output
 * Output consists of N lines. Line contains word "YES", if string is some
 * dialogue of "one" and "puton", otherwise "NO".
 */
public class Task4 {
    public static void main(String[] args) {
        System.out.println(isDialog("inoutone"));
        System.out.println(isDialog("in"));
        System.out.println(isDialog("one"));
        System.out.println(isDialog("oneone"));
        System.out.println(isDialog("aaaone"));
        System.out.println(isDialog("outputinput"));
    }

    private static boolean isDialog(String line) {
        String[] putonWords = {"input", "in", "one"};
        String[] oneWords = {"output", "out"};

        boolean putonFirst = false;
        boolean oneFirst = false;

        for (String word : putonWords) {
            if (line.startsWith(word)) {
                putonFirst = true;
                oneFirst = false;

                break;
            }
        }

        if (!putonFirst) {
            for (String word : oneWords) {
                if (line.startsWith(word)) {
                    oneFirst = true;
                    putonFirst = false;

                    break;
                }
            }
        }

        if (!(putonFirst || oneFirst)) return false;

        StringBuilder sb = new StringBuilder(line);

        if (putonFirst) {
            while (sb.length() > 0) {
                boolean isOk = false;
                for (String word : putonWords) {
                    if (sb.indexOf(word) == 0) {
                        sb.delete(0, word.length());
                        isOk = true;
                        break;
                    }
                }

                if (!isOk) return false;

                if (sb.length() <= 0) return true;

                isOk = false;
                for (String word : oneWords) {
                    if (sb.indexOf(word) == 0) {
                        sb.delete(0, word.length());
                        isOk = true;
                        break;
                    }
                }

                if (!isOk) return false;
            }

            return true;
        } else {
            while (sb.length() > 0) {
                boolean isOk = false;
                for (String word : oneWords) {
                    if (sb.indexOf(word) == 0) {
                        sb.delete(0, word.length());
                        isOk = true;
                        break;
                    }
                }

                if (!isOk) return false;

                isOk = false;
                for (String word : putonWords) {
                    if (sb.indexOf(word) == 0) {
                        sb.delete(0, word.length());
                        isOk = true;
                        break;
                    }
                }
                if (!isOk) return false;
            }

            return true;
        }
    }
}
