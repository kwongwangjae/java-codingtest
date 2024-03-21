import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static int solution(int n, String[] h, String[] s) {
		int answer = 0;
		Deque<String> cars = new ArrayDeque<>();
		List<String> lcars = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			cars.add(h[i]);
		}
		for (int i = 0; i < n; i++) {
			while (lcars.contains(cars.getFirst())) {
				cars.pollFirst();
			}

			if(!cars.getFirst().equals(s[i])){
				answer++;
				lcars.add(s[i]);
			}else{
				cars.pollFirst();
				lcars.add(s[i]);
			}
		}
		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// String[] nm = br.readLine().split(" ");
		int N = Integer.parseInt(String.valueOf(br.readLine()));
		// int M = Integer.parseInt(nm[1]);
		String[] h = new String[N];
		String[] s = new String[N];
		for (int i = 0; i < N; i++) {
			h[i] = br.readLine();
		}
		for (int i = 0; i < N; i++) {
			s[i] = br.readLine();
		}


		System.out.println(solution(N, h, s));
	}
}





