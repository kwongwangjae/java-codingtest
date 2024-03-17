import java.util.*;

class Solution {    
    public String[] solution(String[][] tickets) {
        Map<String, PriorityQueue<String>> map = new HashMap<>();
        for(String[] s : tickets){
            map.putIfAbsent(s[0], new PriorityQueue<String>());
            map.get(s[0]).add(s[1]);
        }
        List<String> answer = new LinkedList<>();
        Deque<String> stack = new ArrayDeque<>();
        stack.push("ICN");
        while(!stack.isEmpty()){
            while(map.containsKey(stack.getFirst()) && !map.get(stack.getFirst()).isEmpty()){
                stack.push(map.get(stack.getFirst()).poll());
            }
            answer.add(0, stack.pop());
        }
        return answer.toArray(new String[0]);
    }
}
