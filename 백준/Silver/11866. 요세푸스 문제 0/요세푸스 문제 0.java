import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static String solution(int N, int K ) {
		StringBuilder answer = new StringBuilder("<");
		Deque<Integer> dq = new ArrayDeque<>();
		for (int i = 1; i <= N; i++) {
			dq.addLast(i);
		}

		int num = K;
		while (!dq.isEmpty()) {
			for (int i = 0; i < K - 1; i++) {
				dq.addLast(dq.pollFirst());
			}
			answer.append(dq.pollFirst()).append(", ");
		}

		answer.setLength(answer.length() - 2);
		answer.append(">");
		return answer.toString();
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int N = kb.nextInt();
		int K = kb.nextInt();
		System.out.println(solution(N, K));
	}

}
