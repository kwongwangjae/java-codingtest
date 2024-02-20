import java.util.*;

class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        
        int[] days = new int[progresses.length];
        for (int i = 0; i < progresses.length; i++) {
            days[i] = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
        }
        
        int cnt = 1; 
        int maxDay = days[0]; 
        
        for (int i = 1; i < days.length; i++) {
            if (days[i] <= maxDay) {
                cnt++;
            } else {
                answer.add(cnt);
                cnt = 1;
                maxDay = days[i];
            }
        }
        answer.add(cnt);
        
        return answer;
    }
}
