
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] nums = br.readLine().trim().split(" ");


		int result = Integer.parseInt(nums[0]) - Integer.parseInt(nums[1]) + 1;
		System.out.println(result);
	}
}