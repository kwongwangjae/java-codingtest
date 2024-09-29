import java.util.HashMap;

class Solution {
	public int lengthOfLongestSubstring(String s) {
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			HashMap<Character, Integer> map = new HashMap<>();
			int max = 0;
			int num = i;
			while (num < s.length() && !map.containsKey(s.charAt(num)))  {
				map.put(s.charAt(num),1);
				max++;
				num++;
			}
			if (max > result) {
				result = max;
			}
		}
		return result;
	}
}