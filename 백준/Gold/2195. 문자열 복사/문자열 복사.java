import java.util.Scanner;

public class Main {

	public static int solution(String s, String p) {
		int answer = 0;
		int idx = 0;
		for (int i = 0; i < p.length(); i++) {
			if (s.indexOf(p.substring(idx, i + 1)) != -1) continue;
			answer++;
			idx = i;
		}
		return answer + 1;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String S = kb.next();
		String P = kb.next();
		System.out.println(solution(S, P));
	}
}
