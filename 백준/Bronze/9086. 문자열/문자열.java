import java.util.*;

class Main {

	public String solution(int n,String[] strs) {
		String answer = "";
		for(int i = 0; i < n; i++){
			if(strs[i].length() == 1){
				answer += strs[i] + strs[i] + '\n';
			}else {
				answer += strs[i].substring(0, 1) + strs[i].substring(strs[i].length() - 1, strs[i].length()) + '\n';
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		// String str = kb.nextLine();
		int n = kb.nextInt();
		kb.nextLine();
		// int k = kb.nextInt();
		// int[][] nums = new int[k][2];
		// for(int i = 0; i < k; i++){
		// 	nums[i][0] = kb.nextInt();
		// 	nums[i][1] = kb.nextInt();
		// }
		String[] strs = new String[n];
		for(int i = 0; i < n; i++){
			strs[i] = kb.nextLine();
		}


		System.out.println(T.solution(n,strs));
	}
}
