import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static String solution(int n, String[] nums) {
		String answer = "";
		Set<String> set = new HashSet<>(List.of(nums));

		List<String> Words = new ArrayList<>(set);

		Collections.sort(Words, (a, b) ->{
			if (a.length() == b.length()) {
				return a.compareTo(b);
			}
			return  Integer.compare(a.length(), b.length());
		});

		for (String s : Words) {
			answer += s + '\n';
		}



		return answer.trim();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(br.readLine());
		String[] nums = new String[N];
		for(int i = 0; i < N; i++) {
			nums[i] = br.readLine();
		}
		System.out.println(solution(N, nums));
	}
}





