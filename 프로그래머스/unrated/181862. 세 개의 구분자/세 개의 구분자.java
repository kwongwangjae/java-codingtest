import java.util.List;
import java.util.ArrayList;


class Solution {
    public List<String> solution(String myStr) {
        List<String> answer = new ArrayList<>();
        String[] len = myStr.split("[abc]");
        for(int i = 0; i < len.length; i++){
            if(!len[i].equals("")){
                answer.add(len[i]);
            }
        }
        if(answer.size() == 0){
            answer.add("EMPTY");
        }
        return answer;
    }
}