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

	public static int solution(String str) {
		String[] strs = str.split("");
		Arrays.sort(strs);

		String ch = "";
		for(int i = 0; i < strs.length; i++){
			ch += strs[strs.length - i - 1];
		}


		return Integer.parseInt(ch);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// String[] nm = br.readLine().split(" ");
		// int N = Integer.parseInt(nm[0]);
		// int M = Integer.parseInt(nm[1]);
		// String[] s = new String[N];
		// for (int i = 0; i < N; i++) {
		// 	s[i] = br.readLine();
		// }
		// String str = br.readLine();
		String str = br.readLine();


		System.out.println(solution(str));
	}
}





