import java.util.*;
class Main {
	public String solution(int[] num){
		String answer = "";
		int[] numSort = Arrays.copyOf(num, num.length);;
		Arrays.sort(numSort);
		int n = 0;
		for(int i = 0; i < num.length; i++){
			n++;
			if(numSort[numSort.length - 1] == num[i]) {
				break;
			}
		}
		answer += numSort[numSort.length - 1] + "\n" + n;
		return answer.trim();
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		// int n=kb.nextInt();
		// int find = kb.nextInt();
		int[] num = new int[9];
		for(int i = 0; i < 9; i++){
			num[i] = kb.nextInt();
		}

		System.out.print(T.solution(num));
	}
}