import java.util.*;
class Main {
	public String solution(int n, int k, int[][] num){
		String answer = "";
		int[] buk = new int[n];
		for(int i = 0; i < k; i++){
			for(int j = num[i][0]; j <= num[i][1]; j++){
				buk[j - 1] = num[i][2];
			}
		}

		for(int i = 0; i < buk.length; i++){
			answer += buk[i] + " ";
		}
		return answer.trim();
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		// int find = kb.nextInt();
		int k = kb.nextInt();
		int[][] num = new int[k][3];
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < 3; j++) {
				num[i][j] = kb.nextInt();
			}
		}

		System.out.print(T.solution(n, k, num));
	}
}