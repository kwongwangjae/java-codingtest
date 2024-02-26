import java.util.*;
class Main {
	public String solution(int[] num, int find){
		String answer = "";
		for(int i = 0; i < num.length; i++){
			if(num[i] < find){
				answer += num[i] + " ";
			}
		}
		return answer.trim();
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int find = kb.nextInt();
		int[] num = new int[n];
		for(int i = 0; i < n; i++){
			num[i] = kb.nextInt();
		}
		System.out.print(T.solution(num, find));
	}
}