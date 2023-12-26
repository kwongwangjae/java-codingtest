import java.util.List;
import java.util.ArrayList;


class Solution {
    public List<Integer> solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();
        for(String x : intStrs){
            String xx = x.substring(s, s + l); // 선언을 해야 바뀜 
            if(Integer.valueOf(xx) > k){
                answer.add(Integer.valueOf(xx));
            }
        }
        return answer;
    }
}