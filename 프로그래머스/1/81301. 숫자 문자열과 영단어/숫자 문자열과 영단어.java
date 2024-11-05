import java.util.HashMap;
import java.util.Map;

class Solution {
	public int solution(String s) {
		Map<String, Integer> numbers = new HashMap<>(){{
			put("zero", 0);
			put("one", 1);
			put("two", 2);
			put("three", 3);
			put("four", 4);
			put("five", 5);
			put("six", 6);
			put("seven", 7);
			put("eight", 8);
			put("nine", 9);
		}};
		String answer = "";
        String alpha = "";
		for (char i : s.toCharArray()) {
			if(Character.isDigit(i)){
				answer += i;
			}else{
				alpha += i;
				if(numbers.containsKey(alpha)){
                    answer += numbers.get(alpha);
                    alpha = "";
                }
			}
		}
		return Integer.parseInt(answer);
	}
}