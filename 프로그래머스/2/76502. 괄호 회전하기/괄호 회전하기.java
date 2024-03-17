import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> map = new HashMap<>(){{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        
        for (int i = 0; i < s.length(); i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            boolean isValid = true;
            for (char c : rotated.toCharArray()) {
                if (!map.containsKey(c)) {
                    stack.push(c);
                } else {
                    if (stack.isEmpty() || stack.pop() != map.get(c)) {
                        isValid = false;
                        break;
                    }
                }
            }
            if (isValid && stack.isEmpty()) {
                answer++;
            }
            stack.clear();
        }
        
        return answer;
    }
}

