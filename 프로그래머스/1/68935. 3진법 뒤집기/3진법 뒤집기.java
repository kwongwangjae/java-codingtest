import java.util.*;

class Solution {
    public int solution(int n) {
        String str = Integer.toString(n, 3);
        String rev = "";
        for(int i = str.length() - 1; i >= 0; i--){
            rev += str.charAt(i);
        }
        
        return Integer.parseInt(rev, 3);
    }
}
