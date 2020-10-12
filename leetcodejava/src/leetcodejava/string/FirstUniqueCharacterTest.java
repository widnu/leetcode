package leetcodejava.string;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class FirstUniqueCharacterTest {

	@Test
	void testFirstUniqChar_0() {
		FirstUniqueCharacter obj = new FirstUniqueCharacter();

		String s = "leetcode";
		int result = obj.firstUniqChar(s);

		Assert.assertEquals(0, result);
	}

	@Test
	void testFirstUniqChar_1() {
		FirstUniqueCharacter obj = new FirstUniqueCharacter();

		String s = "leetclode";
		int result = obj.firstUniqChar(s);

		Assert.assertEquals(3, result);
	}

}
