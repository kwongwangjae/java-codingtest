import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.stream.Collectors;

class Solution {

	public void dfs(List<List<Integer>> results, int[] nums, int index, Deque<Integer> result) {

		results.add(result.stream().collect(Collectors.toList()));

		for (int i = index; i < nums.length; i++) {
			result.add(nums[i]);
			dfs(results, nums, i + 1, result);
			result.removeLast();
		}

	}
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> results = new ArrayList<>();
		dfs(results, nums, 0, new ArrayDeque<>());
		return results;
	}
}

