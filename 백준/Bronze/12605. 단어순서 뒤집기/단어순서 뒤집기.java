import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		for (int i = 1; i <= num; i++) {
			String[] words = br.readLine().trim().split(" ");

			int start = 0;
			int end = words.length - 1;
			while (start < end) {
				String temp = words[start];
				words[start] = words[end];
				words[end] = temp;
				start++;
				end--;
			}
			bw.write("Case #" + i + ":");
			for (String word : words) {
				bw.write(" " + word);
			}
			bw.newLine();
		}

		br.close();
		bw.flush();
		bw.close();
	}
}