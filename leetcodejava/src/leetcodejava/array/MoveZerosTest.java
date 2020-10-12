package leetcodejava.array;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MoveZerosTest {

	@Test
	void testMoveZeroes() {
		int[] nums = { 0, 1, 0, 3, 12 };
		int[] expects = { 1, 3, 12, 0, 0 };

		MoveZeros obj = new MoveZeros();
		obj.moveZeroes(nums);

		Assert.assertArrayEquals(nums, expects);
	}

}
