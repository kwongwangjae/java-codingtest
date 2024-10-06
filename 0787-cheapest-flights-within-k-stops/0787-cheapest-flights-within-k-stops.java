import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
	public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
		Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
		for (int[] flight : flights) {
			map.putIfAbsent(flight[0], new HashMap<>());
			map.get(flight[0]).put(flight[1], flight[2]);
		}

		Queue<List<Integer>> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.get(1)));
		pq.add(Arrays.asList(src, 0, 0));

		//타입아웃 방지를 위한 한번 방문한 경로를 저장해두는 	맵
		Map<Integer, Integer> visited =new HashMap<>();

		while (!pq.isEmpty()) {
			List<Integer> cur = pq.poll();
			int end = cur.get(0);
			int price = cur.get(1);
			int k_v = cur.get(2);

			if (end == dst) {
				return price;
			}

			visited.put(end, k_v);

			if (k_v <= k) {
				k_v += 1;
				if (map.containsKey(end)) {
					for (Map.Entry<Integer, Integer> m : map.get(end).entrySet()) {
						if (!visited.containsKey(m.getKey()) || k_v < visited.get(m.getKey())) {
							int alt = price + m.getValue();
							pq.add(Arrays.asList(m.getKey(), alt, k_v));
						}
					}
				}
			}
		}
		return -1;
	}
}