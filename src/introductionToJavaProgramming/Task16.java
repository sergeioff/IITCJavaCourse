package introductionToJavaProgramming;

/**
 * Longest Common Prefix: Write a function to find the longest common prefix string 
 * amongst an array of strings.
 */

public class Task16 {
	public static void main(String[] args) {
		String[] strings = {"abcs", "abca", "abcde", "ab"};
		
		System.out.println(longestCommonPrefix(strings));
	}
	
	public static String longestCommonPrefix(String[] strings) {
		StringBuilder sb = new StringBuilder();
		
		String first = strings[0];
		
outer:	for (int characterIdx = 0; characterIdx < first.length(); characterIdx++) {
			char character = first.charAt(characterIdx);

			for (int stringIdx = 0; stringIdx < strings.length; stringIdx++) {
				if (strings[stringIdx].length() <= characterIdx) {
					return sb.toString();
				}
				
				if (strings[stringIdx].charAt(characterIdx) != character) {
					continue outer;
				}
			}
			
			sb.append(character);
		}
		
		return sb.toString();
	}
}
