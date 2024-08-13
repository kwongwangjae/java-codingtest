class Solution {
	public int solution(int a, int b) {
		String num = String.valueOf(a);
		num += String.valueOf(b);
		if (Integer.parseInt(num) > a * b * 2) {
			return Integer.parseInt(num);
		}else {
			return a * b * 2;
		}
	}
}