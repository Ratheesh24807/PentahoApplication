package pentaho;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String str =  "1234321";
		
		//Palindrome check
		//A man, a plan, a canal, Panama
		
		if(isPalindrome(str)) {
			
			System.out.println( str +" Is a Palindrome");
			
			
		}else {
			
			System.out.println(str + " is not a Palindrome");
		}
		
		
	}
	
	public static boolean isPalindrome(String name) {
		
		String word = name.replaceAll("[^a-zA-Z0-9]", "").toUpperCase();
		
		
		
		int start = 0;
		int end =word.length()-1;
		
		while(start<end) {
			
			
			if(word.charAt(start) != word.charAt(end)) {
				
				return false;
			}
			start++;
			end--;
		}
		
		return true;
		
		
		
	}

}
