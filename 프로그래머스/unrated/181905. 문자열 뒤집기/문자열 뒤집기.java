class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder();
        StringBuilder re = new StringBuilder();

        answer.append(my_string.substring(0, s));
        re.append(my_string.substring(s, e + 1)).reverse();
        answer.append(re);
        answer.append(my_string.substring(e + 1));

        return answer.toString();
    }
}
