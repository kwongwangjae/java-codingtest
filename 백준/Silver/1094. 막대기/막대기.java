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

	public static int solution(int i) {
		int answer = 0;
		int stick = 64;
		while (i > 0) {
			if(stick > i){
				stick /= 2;
			}else{
				i -= stick;
				answer++;
			}
		}

		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// String[] nm = br.readLine().split(" ");
		// int N = Integer.parseInt(nm[0]);
		// int M = Integer.parseInt(nm[1]);
		// //  String M = nm[1];
		// String[] s = new String[N];
		// String[] r = new String[M];
		// for (int i = 0; i < N; i++) {
		// 	s[i] = br.readLine();
		// }
		// for (int i = 0; i < M; i++) {
		// 	r[i] = br.readLine();
		// }

		// String str = br.readLine();
		// String str = br.readLine();
		int i = Integer.parseInt(br.readLine());

		System.out.println(solution(i));
	}
}





