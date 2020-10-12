package leetcodejava.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ValidPalindrom {
	public boolean isPalindrome(String s) {
		String fixed = s.replaceAll("[^a-zA-Z]+", "");
		System.out.println(fixed);

		char[] arr = fixed.toCharArray();

		List<String> charList = new ArrayList<String>();
		for (char x : arr) {
			charList.add(String.valueOf(x));
		}

		Collections.reverse(charList);

		String compare = String.join("", charList);

		System.out.println(compare);

		if (fixed.equalsIgnoreCase(compare)) {
			return true;
		}

		return false;
	}
}
