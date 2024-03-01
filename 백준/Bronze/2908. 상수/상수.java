import java.math.BigInteger;
import java.util.Scanner;

class Main {

	public int solution(String[] nums) {
		int num1 = Integer.parseInt(String.valueOf(nums[0].charAt(2)))* 100 + Integer.parseInt(String.valueOf(nums[0].charAt(1)))* 10 + Integer.parseInt(String.valueOf(nums[0].charAt(0)));
		int num2 = Integer.parseInt(String.valueOf(nums[1].charAt(2)))* 100 + Integer.parseInt(String.valueOf(nums[1].charAt(1)))* 10 + Integer.parseInt(String.valueOf(nums[1].charAt(0)));
		if(num1 >= num2){
			return num1;
		}
		return num2;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String[] nums = new String[2];
		nums[0] = kb.next();
		nums[1] = kb.next();
		System.out.println(T.solution(nums));
	}
}
