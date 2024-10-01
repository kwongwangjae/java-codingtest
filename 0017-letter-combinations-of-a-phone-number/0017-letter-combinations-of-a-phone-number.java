import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

	public void dfs(List<String> result, Map<Character, List<Character>> phone, String digit, int index,
		StringBuilder path) {
		if (path.length() == digit.length()) {
			result.add(String.valueOf(path));
			return;
		}

		for (Character c : phone.get(digit.charAt(index))) {
			dfs(result, phone, digit, index + 1, new StringBuilder(path).append(c));
		}

	}
	public List<String> letterCombinations(String digits) {
		List<String> result = new ArrayList<>();

		if (digits.length() == 0) {
			return result;
		}
		Map<Character, List<Character>> phone = new HashMap<>();
		phone.put('0', List.of('a', 'b', 'c'));
		phone.put('1', List.of('a', 'b', 'c'));
		phone.put('2', List.of('a', 'b', 'c'));
		phone.put('3', List.of('d', 'e', 'f'));
		phone.put('4', List.of('g', 'h', 'i'));
		phone.put('5', List.of('j', 'k', 'l'));
		phone.put('6', List.of('m', 'n', 'o'));
		phone.put('7', List.of('p', 'q', 'r', 's'));
		phone.put('8', List.of('t', 'u', 'v'));
		phone.put('9', List.of('w', 'x', 'y', 'z'));


		dfs(result, phone, digits, 0, new StringBuilder());
		return result;


	}
}