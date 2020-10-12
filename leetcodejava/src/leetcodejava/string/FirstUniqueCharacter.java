package leetcodejava.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacter {
	public int firstUniqChar(String s) {
		char[] arr = s.toCharArray();

		Map<String, Integer> map = new LinkedHashMap<String, Integer>();

		for (int i = 0; i < arr.length; i++) {
			String cur = String.valueOf(arr[i]);
			if (!map.containsKey(cur)) {
				map.put(cur, 1);
			} else {
				map.put(cur, map.get(cur) + 1);
			}
		}

		System.out.println(map);

		int result = -1;

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
			if (entry.getValue() == 1) {
				result = new String(arr).indexOf(entry.getKey());
				break;
			}

		}

		return result;

	}
}
