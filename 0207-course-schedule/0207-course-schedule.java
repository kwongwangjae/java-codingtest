import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

	public boolean dfs(Map<Integer, List<Integer>> map, Integer m, List<Integer> takes, List<Integer> taken) {
		if (takes.contains(m)) {
			return false;
		}

		if (taken.contains(m)) {
			return true;
		}

		if (map.containsKey(m)) {
			takes.add(m);
			for (Integer take : map.get(m)) {
				if (!dfs(map, take, takes, taken)) {
					return false;
				}
			}
			takes.remove(m);
			taken.add(m);
		}
		return true;
	}

	public boolean canFinish(int numCourses, int[][] prerequisites) {
		Map<Integer, List<Integer>> map = new HashMap<>();
		for (int[] pre : prerequisites) {
			map.putIfAbsent(pre[0], new ArrayList<>());
			map.get(pre[0]).add(pre[1]);
		}

		List<Integer> takes = new ArrayList<>();
		List<Integer> taken = new ArrayList<>();
		for (Integer m : map.keySet()) {
			if (!dfs(map, m, takes, taken)) {
				return false;
			}
		}

		return true;

	}
}