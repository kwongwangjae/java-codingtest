import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine().trim();
		int answer = 0;

		for(int i = 1; i <= str.length(); i++){
			Set<String> setStr = new HashSet<>();
			for (int j = 0; j <= str.length() - i; j++) {
				setStr.add(str.substring(j, j + i));
			}
			answer += setStr.size();
		}
		
		bw.write(String.valueOf(answer));
		br.close();
		bw.flush();
		bw.close();
	}
}