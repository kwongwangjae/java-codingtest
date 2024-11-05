import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
	public int[] solution(int[] numbers) {

		Arrays.sort(numbers);

		Set<Integer> list = new HashSet<>();
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++){
				list.add(numbers[i] + numbers[j]);
			}
		}
		return list.stream().mapToInt(i -> i).sorted().toArray();
	}
}