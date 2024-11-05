import java.util.HashMap;
import java.util.Map;

class Solution {
	public int[] solution(String s) {
		int[] answer = new int[s.length()];
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if(map.containsKey(s.charAt(i))){
				answer[i] = i - map.get(s.charAt(i));
				map.put(s.charAt(i), i);
			}else{
				map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + i);
				answer[i] = -1;
			}
		}
		return answer;
	}
}