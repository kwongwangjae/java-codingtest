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

	public static String solution(String[] s1) {
		String[] s2 = Arrays.copyOf(s1, s1.length);
		Arrays.sort(s2);

		String[] s3 = new String[s1.length];
		for (int i = 0; i < s1.length; i++) {
			s3[i] = s2[s2.length - i - 1];
		}
		if (Arrays.equals(s1, s2)) {
			return "INCREASING";
		} else if (Arrays.equals(s1, s3)) {
			return "DECREASING";
		}else{
			return "NEITHER";
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nm = br.readLine().split(" ");
		int N = Integer.parseInt(nm[0]);
		// int M = Integer.parseInt(nm[1]);
		//  String M = nm[1];
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


		System.out.println(solution(s));
	}
}





