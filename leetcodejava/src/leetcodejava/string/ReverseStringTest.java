package leetcodejava.string;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ReverseStringTest {

	@Test
	void testReverseStringOddList() {
		ReverseString obj = new ReverseString();

		char[] s = { 'h', 'e', 'l', 'l', 'o' };
		char[] expects = { 'o', 'l', 'l', 'e', 'h' };
		obj.reverseString(s);
		Assert.assertArrayEquals(expects, s);
	}

	@Test
	void testReverseStringEvenList() {
		ReverseString obj = new ReverseString();

		char[] s = { 'h', 'e', 'l', 'a', 'l', 'o' };
		char[] expects = { 'o', 'l', 'a', 'l', 'e', 'h' };
		obj.reverseString(s);
		Assert.assertArrayEquals(expects, s);
	}

}
