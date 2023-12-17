import java.util.List;
import java.util.ArrayList;


class Solution {
    public List<String> solution(String[] strArr) {
        List<String> answer = new ArrayList<>();
        for(String x : strArr){
            if(!(x.contains("ad"))){
                answer.add(x);
            }
        }
        return answer;
    }
}