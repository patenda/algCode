package alg;

import java.util.HashMap;
import java.util.Map;

/**
 * * Given a string, find the length of the longest substring without repeating
 * * characters. For example, the longest substring without repeating letters
 * for * "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest *
 * substring is "b", with the length of 1. * * Tags: Hashtable, Two pointers,
 * String
 */

public class LongestSubstring {
	public static void main(String[] args) {
	}

	/**
	 * Traverse the string * Get current character * Update start // point *
	 * Update max * Put current char in map
	 */
	public static int lengthOfLongestSubstring(String s) {
		if (s == null || s.length() == 0)
			return 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int start = 0;
		int max = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			/* start point can be recent dup's next char or last start */
			int newStart = map.containsKey(c) ? map.get(c) + 1 : 0;
			start = Math.max(start, newStart); //第二个重复
			/* if current str len is bigger then update */
			max = Math.max(max, i - start + 1);
			/* add char to map with index */
			map.put(c, i);
		}
		return max;
	}
}

