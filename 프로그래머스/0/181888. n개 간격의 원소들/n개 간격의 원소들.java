class Solution {
    public int[] solution(int[] num_list, int n) {
        int num_list_length = num_list.length;
        int length = 0;
        while(num_list_length > 0){
            num_list_length-=n;
            length++;
        }
        
        int[] answer = new int[length];
        for(int i = 0; i < answer.length; i++){
            answer[i] = num_list[n * i];
        }
        return answer;
    }
}