import java.util.*;

class Main {

	public String solution(String str) {
		String answer = "";
		for(char ch = 'a'; ch <= 'z'; ch++){
			answer += str.indexOf(ch) + " ";
		}
		return answer.trim();
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();


		System.out.println(T.solution(str));
	}
}
