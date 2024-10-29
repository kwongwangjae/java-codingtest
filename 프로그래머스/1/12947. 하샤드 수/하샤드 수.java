class Solution {
	public boolean solution(int x) {
		int xl = 0;
		int oX = x; 
		
		while (x > 0) {
			xl += x % 10;
			x = x / 10;
		}
		
		return oX % xl == 0;
	}
}
