import java.util.*;

class Main {

	public int solution(int len, String str) {
		int answer = 0;
		for(int i = 0; i < len; i++){
			answer += Integer.parseInt(String.valueOf(str.charAt(i)));
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int len = kb.nextInt();
		String str = kb.next();


		System.out.println(T.solution(len, str));
	}
}
