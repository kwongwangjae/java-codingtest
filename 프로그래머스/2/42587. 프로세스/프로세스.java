import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<Integer> queue = new LinkedList<>();
        for (int priority : priorities) {
            queue.offer(priority);
        }
        
        Arrays.sort(priorities);
        int size = priorities.length - 1;
        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (current == priorities[size - answer]) {
                answer++;
                if (location == 0) {
                    break;
                }
            } else {
                queue.offer(current);
            }
            location = (location == 0) ? queue.size() - 1 : location - 1;
        }
        
        return answer;
    }
}
