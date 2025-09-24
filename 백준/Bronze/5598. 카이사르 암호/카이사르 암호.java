import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		StringBuilder answer = new StringBuilder();
		for (Character ch : str.toCharArray()) {
			int i = ch - 3;
			if(i < 65){
				i += 26;
			}
			answer.append((char)i);
		}

		bw.write(String.valueOf(answer));
		br.close();
		bw.flush();
		bw.close();
	}
}