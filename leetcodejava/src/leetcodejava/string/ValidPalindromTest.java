package leetcodejava.string;


import org.junit.Assert;
import org.junit.jupiter.api.Test;



class ValidPalindromTest {

	@Test
	void testIsPalindromeTrue() {
		ValidPalindrom obj = new ValidPalindrom();
		
		String s = "A man, a plan, a canal: Panama";
		boolean result = obj.isPalindrome(s);
		Assert.assertEquals(true, result);
	}

	@Test
	void testIsPalindromeFalse() {
		ValidPalindrom obj = new ValidPalindrom();
		
		String s = "A a fman, a plan, a canal: Panama";
		boolean result = obj.isPalindrome(s);
		Assert.assertEquals(false, result);
	}
}
