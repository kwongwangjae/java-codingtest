import java.util.HashMap;
import java.util.Map;

class Solution {
	public String solution(String[] participant, String[] completion) {
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < participant.length; i++) {
			map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
		}

		for (String com : completion) {
			int left = map.get(com);
			if (left == 1) {
				map.remove(com);
			}else{
				map.put(com, left - 1);
			}
		}
		return map.entrySet().iterator().next().getKey();
	}
}