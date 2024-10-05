import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {

	public void dfs(List<String> results, Map<String, PriorityQueue<String>> map, String from) {
		while (map.containsKey(from) && !map.get(from).isEmpty()) {
			dfs(results, map, map.get(from).poll());
		}
		results.add(0, from);
	}
	public List<String> findItinerary(List<List<String>> tickets) {
		List<String> results = new LinkedList<>();
		HashMap<String, PriorityQueue<String>> map = new HashMap<>();
		for (List<String> ticket : tickets) {
			map.putIfAbsent(ticket.get(0), new PriorityQueue<>());
			map.get(ticket.get(0)).add(ticket.get(1));
		}
		dfs(results, map, "JFK");

		return results;

	}
}