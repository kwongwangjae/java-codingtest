import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
	public int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[1] - a[1]);
		for (int m : map.keySet()) {
			pq.add(new int[]{m, map.get(m)});
		}

		int[] result = new int[k];
		for (int i = 0; i < k; i++) {
			result[i] = pq.poll()[0];
		}
		return result;


	}
}