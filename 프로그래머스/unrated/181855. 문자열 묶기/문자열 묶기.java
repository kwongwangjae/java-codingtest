
class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int max = 0;
        int[] len = new int[30];
        for(int i = 0; i < strArr.length; i++){
            len[strArr[i].length() -1]++;
        }
        for(int i = 0; i < 30; i++){
            if(len[i] > max){
                max = len[i];
            }
        }
        answer = max;
        return answer;
    }
}