import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> solution(int n, int k) {
        ArrayList<Integer> answer = new ArrayList<>();
        int num = k;
        while(k <= n){
            answer.add(k);
            k = k + num;
        }
        return answer;
    }
}