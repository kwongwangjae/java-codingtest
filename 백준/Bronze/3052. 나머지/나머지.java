import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Set<Integer> answer = new HashSet<>();
		for (int i = 0; i < 10; i++) {
			int num = Integer.parseInt(br.readLine());
			answer.add(num % 42);
		}


		bw.write(String.valueOf(answer.size()));
		br.close();
		bw.flush();
		bw.close();
	}
}