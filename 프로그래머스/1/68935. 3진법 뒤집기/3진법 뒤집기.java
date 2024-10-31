import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
	public int solution(int n) {
		int answer = 0;
		Deque<Integer> stack = new ArrayDeque<>();

		while (n > 0) {
			stack.add(n % 3);
			n /= 3;
		}

		int x = 0;
		while (!stack.isEmpty()) {
			answer += stack.pollLast() * Math.pow(3, x);
			x++;
		}

		return answer;
	}
}
