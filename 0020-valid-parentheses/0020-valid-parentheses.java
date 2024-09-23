import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
	public boolean isValid(String s) {
		Deque<Character> stack = new ArrayDeque<>();
		Map<Character,Character> table = new HashMap<>(){{
			put(')','(');
			put('}','{');
			put(']','[');
		}};
		for (char c : s.toCharArray()) {
			if (!table.containsKey(c)) {
				stack.push(c);
			} else if (stack.isEmpty() || table.get(c) != stack.pop()) {
				return false;
			}
		}
		return stack.size() == 0;
	}
}