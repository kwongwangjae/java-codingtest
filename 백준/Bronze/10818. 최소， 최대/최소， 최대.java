import java.util.*;
class Main {
	public String solution(int[] num){
		String answer = "";
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < num.length; i++){
			if(num[i] >= max){
				max = num[i];
			}
			if(num[i] <= min){
				min = num[i];
			}
		}
		answer = min + " " + max;
		return answer.trim();
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		// int find = kb.nextInt();
		int[] num = new int[n];
		for(int i = 0; i < n; i++){
			num[i] = kb.nextInt();
		}
		System.out.print(T.solution(num));
	}
}