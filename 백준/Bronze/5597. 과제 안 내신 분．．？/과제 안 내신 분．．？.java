import java.util.*;

class Main {

	public String solution(int[] stu) {
		String answer = "";
		boolean[] submitted = new boolean[31];
		for (int s : stu) {
			submitted[s] = true;
		}
		for (int i = 1; i <= 30; i++) {
			if (!submitted[i]) {
				answer += i + "\n"; 
			}
		}
		return answer.trim();


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
		int[] stu = new int[28];
		for(int i = 0; i < 28; i++){
			stu[i] = kb.nextInt();
		}

		System.out.println(T.solution(stu));
	}
}
