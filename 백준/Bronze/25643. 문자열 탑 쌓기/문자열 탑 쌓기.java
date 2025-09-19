import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int answer = 0;
		String base = br.readLine().trim();

		if(N == 1){
			System.out.println(1);
			return;
		}

		for (int i = 1; i < N; i++) {
			answer = 0;
			String line = br.readLine().trim();

			for (int j = 1; j <= M; j++) {
				if (base.substring(0, j).equals(line
					.substring(line.length() - j))) {
					answer = 1;
					break;
				}
				if (line.substring(0, j).equals(base
					.substring(base.length() - j))) {
					answer = 1;
					break;
				}

			}

			if(answer == 0) {
				break;
			}

			base = line;
		}


		bw.write(String.valueOf(answer));
		br.close();
		bw.flush();
		bw.close();
	}
}
