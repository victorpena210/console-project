package palindrome;

public class palindromeOne {
	


	
	public static boolean palindrome(String word) {
		boolean result;
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(word);
		stringBuilder.reverse();
		System.out.println(stringBuilder);
		String reversed = stringBuilder.toString();
		if(word.equals(reversed)) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
	
	
	
	
	
	public static void main(String[] args) {
		palindrome("test");
		palindrome("racecar");
		palindrome("what");
		palindrome("wow");
		palindrome("mom");
		
	}
} 

	
