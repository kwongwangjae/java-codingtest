class Solution {
	public int solution(int[][] sizes) {
		int max = 0;
		int min = 0;
		for (int[] size : sizes) {
			int m = Math.max(size[0], size[1]);
			int n = Math.min(size[0], size[1]);
			if(m > max)max = m;
			if(n > min)min = n;
		}
		return max * min;
	}
}