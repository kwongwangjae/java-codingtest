class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int ab = Integer.parseInt(""+a+b);
        int p = 2 * a * b;
        if(ab >= p){
            answer = ab;
        }else{
            answer = p;
        }
        return answer;
    }
}