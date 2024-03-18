class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int m = 0;
        int n = 0;
        for(int i = 1; i <= yellow; i++){
            if(yellow % i == 0){
                m = i + 2;
                n = (yellow / i) + 2;
            }
            if(((Math.max(m,n) * 2) + ((Math.min(m,n) -2) * 2)) == brown){
                answer[0] = Math.max(m,n);
                answer[1] = Math.min(m,n);
            }
        }
        return answer;
    }
}
