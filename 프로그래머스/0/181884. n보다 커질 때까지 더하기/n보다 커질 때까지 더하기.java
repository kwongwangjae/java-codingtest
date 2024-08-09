class Solution {
    public int solution(int[] numbers, int n) {
        int nums = 0;
        for(int num : numbers){
            nums += num;
            if(nums > n){
                break;
            }
        }
        return nums;
    }
}