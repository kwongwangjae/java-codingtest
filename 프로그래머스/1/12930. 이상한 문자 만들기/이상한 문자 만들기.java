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
				answer += Character.toUpperCase(ch);
				num++;
			}else{
				answer += Character.toLowerCase(ch);
				num++;
			}
		}
		return answer;
	}
}