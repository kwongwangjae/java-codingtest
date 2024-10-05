import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {

	public void dfs(List<String> results, Map<String, PriorityQueue<String>> map,String from) {
		while (map.containsKey(from) && !map.get(from).isEmpty()) {
			dfs(results, map, map.get(from).poll());
		}
		results.add(0, from);
	}
	public String[] solution(String[][] tickets) {
		List<String> results = new LinkedList<>();

		Map<String, PriorityQueue<String>> map = new HashMap<>();
		for (String[] strings : tickets) {
			map.putIfAbsent(strings[0], new PriorityQueue<>());
			map.get(strings[0]).add(strings[1]);
		}

		dfs(results, map, "ICN");

		return results.toArray(new String[0]);
	}
}