	class Solution {
		public String solution(String s, int n) {
			String answer = "";
			for (char ch : s.toCharArray()) {
				if (Character.isUpperCase(ch)) {
					answer += (char) ((ch - 'A' + n) % 26 + 'A');
				}else if(Character.isLowerCase(ch)){
					answer += (char) ((ch - 'a' + n) % 26 + 'a');
				}else{
                    answer += ch;
                }
			}
			return answer;
		}
	}