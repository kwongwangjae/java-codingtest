class Solution {
	public int solution(String my_string, String is_suffix) {
		int answer = 0;
		for (int i = my_string.length() -1; i >= 0; i--) {
			if (my_string.substring(i, my_string.length()).equals(is_suffix)) {
				answer++;
			}
		}
		return answer;
	}
}