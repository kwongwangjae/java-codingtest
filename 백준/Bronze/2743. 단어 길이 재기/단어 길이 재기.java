import java.util.*;

class Main {

	public int solution(String str) {
		return str.length();
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		// int n = kb.nextInt();
		// int k = kb.nextInt();
		// int[][] nums = new int[k][2];
		// for(int i = 0; i < k; i++){
		// 	nums[i][0] = kb.nextInt();
		// 	nums[i][1] = kb.nextInt();
		// }


		System.out.println(T.solution(str));
	}
}
