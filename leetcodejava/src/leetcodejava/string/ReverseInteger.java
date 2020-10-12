package leetcodejava.string;

public class ReverseInteger {
	public int reverse(int x) {
		int result = 0;
		boolean isNeg = false;

		if (x < 0) {
			x = -1 * x;
			isNeg = true;
		}

		int len = (String.valueOf(x)).length();
		System.out.println("x.len: " + len);

		for (int i = 0; i < len; i++) {
			int cur = x % 10;
			System.out.println("cur: " + cur);

			x = Math.round(x / 10);
			System.out.println("x: " + x);

			cur = cur * (int) Math.pow(10, len - i - 1);
			System.out.println("cur: " + cur);

			result += cur;
			System.out.println("result: " + result);
		}

		if (isNeg) {
			result = -1 * result;
		}

		return result;
	}
}
