package leetcodejava.array;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MoveZeros {

	public void moveZeroes(int[] nums) {
		int zeroCount = 0;
		int copyLen = 0;
		int[] copy = new int[nums.length];

		for (int i = 0, j = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				copy[j++] = nums[i];
				zeroCount++;
				copyLen = j + 1;
			}
		}

		System.out.println(zeroCount);
		System.out.println(copyLen);

		if (copyLen < nums.length) {
			for (int i = copyLen + 1; i < nums.length - 1; i++) {
				copy[i] = 0;
			}
		}

		for (int i = 0; i < nums.length; i++) {
			nums[i] = copy[i];
		}

	}

}
