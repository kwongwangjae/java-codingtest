import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static String solution(int n, int m, String[] h, String[] s) {
		StringBuilder answer = new StringBuilder();
		List<String> li = new ArrayList<>();
		int num = 0;
		Set<String> set = new HashSet<>(List.of(h));
		for (int i = 0; i < m; i++) {
			if (set.contains(s[i])) {
				num++;
				li.add(s[i]);
			}
		}
		Collections.sort(li);
		answer.append(num).append("\n");
		for (String name : li) {
			answer.append(name).append("\n");
		}

		return answer.toString();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nm = br.readLine().split(" ");
		int N = Integer.parseInt(nm[0]);
		int M = Integer.parseInt(nm[1]);
		String[] h = new String[N];
		String[] s = new String[M];
		for (int i = 0; i < N; i++) {
			h[i] = br.readLine();
		}
		for (int i = 0; i < M; i++) {
			s[i] = br.readLine();
		}


		System.out.println(solution(N, M, h, s));
	}
}





