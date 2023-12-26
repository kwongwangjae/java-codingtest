import java.util.List;
import java.util.ArrayList;


class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        double num = 1;
        while(num < arr.length){
            num = num * 2;
        }
        for(int i = 0; i < num; i++){
            if(i < arr.length){
                answer.add(arr[i]);
            } else{
                answer.add(0);
            }
        }
        return answer;
    }
}