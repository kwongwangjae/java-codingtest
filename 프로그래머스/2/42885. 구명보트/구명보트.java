import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        
        int answer = 0;
        int lg = 0;
        int hv = people.length - 1;
        while(lg <= hv){
            if(people[lg] + people[hv] <= limit){
                answer++;
                lg++;
                hv--;
            } else{
                answer++;
                hv--;
            }
        }
        return answer;
    }
}