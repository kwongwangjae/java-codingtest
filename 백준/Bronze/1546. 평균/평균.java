import java.util.*;

class Main {

	public double solution(int n , int[] score) {
		double answer = 0;
		Arrays.sort(score);
		int max = score[score.length -1];
		for(int i = 0; i < n; i++){
			answer += ((double)score[i] / max * 100);
		}



		return answer / n;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		// int k = kb.nextInt();
		// int[][] nums = new int[k][2];
		// for(int i = 0; i < k; i++){
		// 	nums[i][0] = kb.nextInt();
		// 	nums[i][1] = kb.nextInt();
		// }
		int[] score = new int[n];
		for(int i = 0; i < n; i++){
			score[i] = kb.nextInt();
		}


		System.out.println(T.solution(n, score));
	}
}
