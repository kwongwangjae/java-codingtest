import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static int solution(int n , String y, String[] s1) {
		Set<String> s = new HashSet<>();
		for (int i = 0; i < n; i++) {
			s.add(s1[i]);
		}
		int a = 0;
		if (y.charAt(0) == 'Y') {
			a = 1;
		} else if (y.charAt(0) == 'F') {
			a = 2;
		} else{
			a = 3;
		}

		return s.size() / a;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nm = br.readLine().split(" ");
		int N = Integer.parseInt(nm[0]);
		// int M = Integer.parseInt(nm[1]);
		 String M = nm[1];
		String[] s = new String[N];
		// String[] r = new String[M];
		for (int i = 0; i < N; i++) {
			s[i] = br.readLine();
		}
		// for (int i = 0; i < M; i++) {
		// 	r[i] = br.readLine();
		// }

		// String str = br.readLine();
		// String str = br.readLine();


		System.out.println(solution(N, M, s));
	}
}





