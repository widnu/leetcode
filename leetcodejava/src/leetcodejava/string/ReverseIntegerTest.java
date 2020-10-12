package leetcodejava.string;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ReverseIntegerTest {

	@Test
	void reverseTestPos() {
		ReverseInteger obj = new ReverseInteger();

		int x = 779883;
		int result = obj.reverse(x);

		Assert.assertEquals(388977, result);
	}

	@Test
	void reverseTestNeg() {
		ReverseInteger obj = new ReverseInteger();

		int x = -779883;
		int result = obj.reverse(x);

		Assert.assertEquals(-388977, result);
	}

}
