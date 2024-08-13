class Solution {
	public int solution(int[] num_list) {
		int p = 0;
		int x = 1;
		for (int i = 0; i < num_list.length; i++) {
			p += num_list[i];
			x *= num_list[i];
		}
		if (Math.pow(p,2) > x) {
			return 1;
		}else{
			return 0;
		}
	}
}