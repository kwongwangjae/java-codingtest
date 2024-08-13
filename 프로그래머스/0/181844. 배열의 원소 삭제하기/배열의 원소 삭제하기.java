import java.util.ArrayList;
import java.util.List;

class Solution {
	public int[] solution(int[] arr, int[] delete_list) {
		List<Integer> nums = new ArrayList<>();
		for (int num : arr) {
			boolean c = true;
			for (int deleteNum : delete_list) {
				if (num == deleteNum) {
					c = false;
				}
			}
			if (c == true) {
				nums.add(num);
			}
		}
		return nums.stream().mapToInt(i -> i).toArray();
	}
}