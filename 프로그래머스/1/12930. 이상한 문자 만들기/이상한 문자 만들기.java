class Solution {
	public String solution(String s) {
		String answer = "";
		int num = 1;
		for (char ch : s.toCharArray()) {
			if(ch == ' '){
				answer += " ";
				num = 1;
			}
			else if(num % 2 == 1) {
				answer += String.valueOf(ch).toUpperCase();
				num++;
			}else{
				answer += String.valueOf(ch).toLowerCase();
				num++;
			}
		}
		return answer;
	}
}