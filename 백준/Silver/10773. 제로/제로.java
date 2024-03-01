import java.math.BigInteger;
import java.util.Scanner;
import java.util.Stack;

class Main {

	public int solution(int n, int[] nums) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < n; i++) {
			if (nums[i] != 0) {
				stack.push(nums[i]);
				answer += nums[i];
			} else if (nums[i] == 0 || !stack.isEmpty()) {
				answer -= stack.pop();
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		int[] nums = new int[num];
		for(int i = 0; i < num; i++){
			nums[i] = kb.nextInt();
		}
		System.out.println(T.solution(num, nums));
	}
}
