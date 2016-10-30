package exercises.exercise_10;

/**
 * 8. Дано слово, состоящее только из строчных латинских букв.
 * Проверьте, является ли это слово палиндромом. Выведите YES или NO.
 * При решении этой задачи нельзя пользоваться циклами.
 */
public class Task8 {
    public static void main(String[] args) {
       printYesOrNo(isPalindrome("a"));
       printYesOrNo(isPalindrome("aa"));
       printYesOrNo(isPalindrome("ab"));
       printYesOrNo(isPalindrome("aba"));
       printYesOrNo(isPalindrome("abba"));
       printYesOrNo(isPalindrome("rawraw"));
       printYesOrNo(isPalindrome("warraw"));
    }

    private static void printYesOrNo(boolean value) {
        System.out.println(value ? "YES" : "NO");
    }

    private static boolean isPalindrome(String word) {
        if (word.length() <= 1) return true;
        char firstCharacter = word.charAt(0);
        char lastCharacter = word.charAt(word.length() - 1);

        if (firstCharacter != lastCharacter) return false;
        return isPalindrome(word.substring(1, word.length() - 1));
    }
}
