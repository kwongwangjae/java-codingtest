import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine().trim();

		int start = 0;
		int end = str.length() - 1;
		
		boolean answer = true;

		while (start < end){
			if (str.charAt(start) != str.charAt(end)) {
				answer = false;
				break;
			}
			start++;
			end--;
		}

		bw.write(String.valueOf(answer));
		br.close();
		bw.flush();
		bw.close();
	}
}