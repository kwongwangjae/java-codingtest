import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for(int i = 1; i <= citations.length; i++){
            int hi = 0;
            int lo = 0;
            for(int j = 0; j < citations.length; j++){
                if(citations[j] <= i)lo++;
                if(citations[j] >= i)hi++;
            }
            if(hi >= i && lo <= i) answer = i;
        }
        return answer;
    }
}