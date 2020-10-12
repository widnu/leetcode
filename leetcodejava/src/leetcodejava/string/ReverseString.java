package leetcodejava.string;

public class ReverseString {
	public void reverseString(char[] s) {
		int len = s.length;

		System.out.println(len);
		System.out.println((double) len / 2);

		int mid = (int) Math.floor((double) len / 2);

		System.out.println(mid);

		int leftIdx = 0;
		int rightIdx = 0;

		if (len % 2 == 0) {
			mid--;
			leftIdx = mid;
			rightIdx = mid + 1;
		} else {
			leftIdx = mid - 1;
			rightIdx = mid + 1;
		}

		while (rightIdx < len) {
			char left = s[leftIdx];
			char right = s[rightIdx];

			s[leftIdx] = right;
			s[rightIdx] = left;

			leftIdx--;
			rightIdx++;

		}
	}
}
