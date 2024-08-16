class Solution {
	public int solution(int n) {
		int i = 1;
		while (Math.pow(i,2) <= n) {
			if (Math.pow(i, 2) == n) {
				return 1;
			}
			i++;
		}
		return 2;
	}
}