import java.util.*;

class Main {

	public int solution(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < 10; i++){
			set.add(nums[i] % 42);
		}
		return set.size();
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		// int n = kb.nextInt();
		// int k = kb.nextInt();
		// int[][] nums = new int[k][2];
		// for(int i = 0; i < k; i++){
		// 	nums[i][0] = kb.nextInt();
		// 	nums[i][1] = kb.nextInt();
		// }
		int[] nums = new int[10];
		for(int i = 0; i < 10; i++){
			nums[i] = kb.nextInt();
		}


		System.out.println(T.solution(nums));
	}
}
