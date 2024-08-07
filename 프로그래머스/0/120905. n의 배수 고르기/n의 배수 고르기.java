import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> number = new ArrayList<>();
        for(int num : numlist){
            if(num % n == 0){
                number.add(num);
            }
        }
        return number.stream().mapToInt(i -> i).toArray();
    }
}