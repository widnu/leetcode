package leetcodejava.array;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TwoSumTest {

	@Test
	void testTwoSum() {
		int[] nums = { 2, 7, 11, 15 };
		int target = 26;

		int[] expects = { 2, 3 };

		TwoSum obj = new TwoSum();
		int[] result = obj.twoSum(nums, target);

		Assert.assertArrayEquals(result, expects);
	}

}
