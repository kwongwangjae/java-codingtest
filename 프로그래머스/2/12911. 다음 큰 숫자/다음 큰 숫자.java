class Solution {
    public int solution(int n) {
        int answer = n + 1;
        String bin = Integer.toString(n, 2);
        int num1 = 0;
        for(char c : bin.toCharArray()){
                if(c == '1'){
                    num1++;
                }
            }
        while(true){
            String binA = Integer.toString(answer, 2);
            int num2 = 0;
            for(char c : binA.toCharArray()){
                if(c == '1'){
                    num2++;
                }
            }
            if(num1 == num2){
                return answer;
            }
            answer++;
        }
    }
}
