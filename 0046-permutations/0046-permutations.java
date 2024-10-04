import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {

	public void dfs(List<List<Integer>> results, List<Integer> preElements, List<Integer> elements) {
		if (elements.isEmpty()) {
			results.add(preElements.stream().collect(Collectors.toList()));
		}

		for (Integer e : elements) {
			List<Integer> nextElements = new ArrayList<>(elements);
			nextElements.remove(e);

			preElements.add(e);
			dfs(results, preElements, nextElements);
			preElements.remove(e);
		}


	}

	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();

		List<Integer> lst = Arrays.stream(nums).boxed().collect(Collectors.toList());
		dfs(result, new ArrayList<>(), lst);

		return result;
	}
}