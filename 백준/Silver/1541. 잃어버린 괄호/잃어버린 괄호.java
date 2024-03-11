import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	private static int c(String s1) {
		String[] numbers = s1.split("\\+");
		int sum = 0;
		for (String num : numbers) {
			sum += Integer.parseInt(num);
		}
		return sum;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();

		String[] parts = s1.split("-");
		int answer = c(parts[0]);

		for (int i = 1; i < parts.length; i++) {
			answer -= c(parts[i]);
		}

		System.out.println(answer);
	}

}
