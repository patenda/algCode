package alg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestSubstringTest {

	@Test
	void test() {
		assertEquals(LongestSubstring.lengthOfLongestSubstring("abcabcbb"),3); // //
		assertEquals(LongestSubstring.lengthOfLongestSubstring("bbbbb"),1); // //
		assertEquals(LongestSubstring.lengthOfLongestSubstring(""),0); // //
		assertEquals(LongestSubstring.lengthOfLongestSubstring("fdjskajfhh"),6); // //
		assertEquals(LongestSubstring.lengthOfLongestSubstring("iiiiiiioooooooooooooo"),2);
		assertEquals(LongestSubstring.lengthOfLongestSubstring("aeiou"),5);
		assertEquals(LongestSubstring.lengthOfLongestSubstring("hnwnkuewhsqmgbbuqcljjivswmdkqtbxixmvtrrbljptnsnfwzqfjmafadrrwsofsbcnuvqhffbsaqxwpqcac"),12);

	}

}
