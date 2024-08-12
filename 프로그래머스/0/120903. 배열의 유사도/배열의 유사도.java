class Solution {
	public int solution(String[] s1, String[] s2) {
		int answer = 0;
		for (String s1x : s1) {
			for (String s2x : s2) {
				if (s1x.equals(s2x)) {
					answer++;
				}
			}
		}
		return answer;
	}
}