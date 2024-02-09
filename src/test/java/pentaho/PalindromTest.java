package pentaho;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromTest {

	@Test
	public void testIsPalindrome() {
		Palindrome palindrom = new Palindrome();

		// Test for a valid palindrome
		assertTrue(Palindrome.isPalindrome("A man, a plan, a canal, Panama"));

		// Test for a valid palindrome with mixed case
		assertTrue(Palindrome.isPalindrome("Racecar"));

		// Test for a non-palindrome
		assertFalse(Palindrome.isPalindrome("Hello, World!"));

		// Test for an empty string
		assertTrue(Palindrome.isPalindrome("")); // Empty string is considered a palindrome

	
		//Test Integer value
		assertTrue(Palindrome.isPalindrome("12345654321"));
		
		assertFalse(Palindrome.isPalindrome("1234"));
		
		
	
	}
}
