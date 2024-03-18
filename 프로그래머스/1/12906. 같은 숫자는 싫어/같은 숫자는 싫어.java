import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> dq = new ArrayDeque<>();
        for(int a : arr){
            if(dq.isEmpty() || dq.peekLast() != a){
                dq.addLast(a);
            }
        }
        int[] answer = new int[dq.size()];
        int index = 0;
        for (int num : dq) {
            answer[index++] = num;
        }
        return answer;
    }
}
