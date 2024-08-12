class Solution {
	public int solution(int[] num_list) {
		String hnum = "";
        String znum = "";
		for (int x : num_list) {
			if (x % 2 == 1) {
				hnum += x;
			}else{
                znum += x;
            }
		}
		return Integer.parseInt(hnum) + Integer.parseInt(znum);
	}
}