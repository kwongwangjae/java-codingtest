import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Set<Integer> set = new HashSet<>();

		int N = Integer.parseInt(br.readLine());
		StringTokenizer numsN = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			set.add(Integer.parseInt(numsN.nextToken()));
		}


		int M = Integer.parseInt(br.readLine());
		StringTokenizer numsM = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			if(set.contains(Integer.parseInt(numsM.nextToken()))){
				bw.write("1\n");
			}else {
				bw.write("0\n");
			}
		}

		br.close();
		bw.flush();
		bw.close();
	}
}