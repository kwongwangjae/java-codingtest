import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String line = br.readLine();
		Deque<Character> sign = new ArrayDeque<>();
		Deque<Character> words = new ArrayDeque<>();

		for (char ch : line.toCharArray()) {
			if (ch == '>') {
				sign.pop();
				bw.write(ch);
			} else if (!sign.isEmpty()) {
				bw.write(ch);
			} else if (ch == '<') {
				while (!words.isEmpty()) {
					bw.write(words.pollLast());
				}
				sign.add(ch);
				bw.write(ch);
			} else if (ch == ' ') {
				while (!words.isEmpty()){
					bw.write(words.pollLast());
				}
				bw.write(' ');
			} else {
				words.add(ch);
			}
		}
		while (!words.isEmpty()) {
			bw.write(words.pollLast());
		}
		br.close();
		bw.flush();
		bw.close();
	}
}