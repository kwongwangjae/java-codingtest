class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int num = 0;
        int zero = 0;
        StringBuilder res = new StringBuilder(s);

        while (!res.toString().equals("1")) {
            int count = res.toString().replaceAll("0", "").length();
            zero += res.length() - count;
            res.setLength(count);

            res = new StringBuilder(Integer.toBinaryString(res.length()));
            num++;
        }
        
        answer[0] = num;
        answer[1] = zero;
        
        return answer;
    }
}
