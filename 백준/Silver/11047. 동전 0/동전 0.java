import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static int solution(int n , int k, int[] nums) {
		int answer = 0;
		int hap = k;
			for (int i = n - 1; i >= 0; i--) {
				while (nums[i] <= hap){
					hap -= nums[i];
					answer++;
				}
			}

		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int num = Integer.parseInt(input[0]);
		int hap = Integer.parseInt(input[1]);
		int[] nums = new int[num];
		for (int i = 0; i < num; i++) {
			nums[i] = Integer.parseInt(br.readLine());
		}
		System.out.println(solution(num, hap, nums));
	}
}
