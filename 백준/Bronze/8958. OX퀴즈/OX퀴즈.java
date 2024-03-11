import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static String solution(int s1, String[] s2) {
		String answer = "";
		for (int i = 0; i < s1; i++) {
			int s  = 0;
			int c = 0;
			for (int j = 0; j < s2[i].length(); j++) {
				if (s2[i].charAt(j) == 'O') {
					c++;
					s += c;
				} else {
					c = 0;
				}
			}
			answer += s + "\n";
		}


		return answer.trim();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int s1 = Integer.parseInt(br.readLine());
		String[] s2 = new String[s1];
		for (int i = 0; i < s1; i++) {
			s2[i] = br.readLine();
		}

		System.out.println(solution(s1, s2));
	}
}
