class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder answer = new StringBuilder(my_string);
        
        for(int i = 0; i< queries.length; i++){
            answer.replace(queries[i][0], queries[i][1]+1, new StringBuilder(answer.substring(queries[i][0], queries[i][1]+1)).reverse().toString());
        } //new StringBuilder 재선언이 필요하다.
        return answer.toString();
    }
}