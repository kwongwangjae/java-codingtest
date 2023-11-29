class Solution {
    public String solution(String n_str) {
        String answer = "";
		int tmp =0;
        if(n_str.charAt(0) == '0') {
		for(int i = 0; i <n_str.length(); i++){
			if(n_str.charAt(i) != '0'){
				 tmp = i;
                break;
			}
		}
        }
        answer = n_str.substring(tmp);
        return answer;
    }
}