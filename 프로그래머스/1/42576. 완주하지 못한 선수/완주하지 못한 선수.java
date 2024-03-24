import java.util.HashMap;
import java.util.Map;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> list = new HashMap<>();
        for(String pc : participant){
            list.put(pc, list.getOrDefault(pc, 0) + 1);
        }
        for(String ct : completion){
            if(list.containsKey(ct)){
                list.put(ct, list.get(ct) -1);
                if(list.get(ct) == 0){
                    list.remove(ct);
                }
            }
        }
        for(String r : list.keySet()){
            answer = r;
        }
        return answer;
    }
}

