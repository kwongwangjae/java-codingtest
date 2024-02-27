import java.util.*;

class Main {

	public String solution(int n, int k, int[][] nums) {
		String answer = "";
		int[] bucket = new int[n];
		for(int i = 0; i < n; i++){
			bucket[i] = i + 1;
		}
		for(int i = 0; i < k; i++){
			int temp = bucket[nums[i][0] - 1];
			bucket[nums[i][0] - 1] = bucket[nums[i][1] - 1];
			bucket[nums[i][1] - 1] = temp;
		}
		for(int i = 0; i < n; i++){
			answer += bucket[i] + " ";
		}

		return answer.trim();


	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[][] nums = new int[k][2];
		for(int i = 0; i < k; i++){
			nums[i][0] = kb.nextInt();
			nums[i][1] = kb.nextInt();
		}

		System.out.println(T.solution(n, k, nums));
	}
}
