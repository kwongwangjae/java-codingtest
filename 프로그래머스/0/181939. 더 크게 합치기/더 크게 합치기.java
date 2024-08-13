class Solution {
	public int solution(int a, int b) {
		int aH = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
		int bH = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
		return Math.max(aH, bH);
	}
}