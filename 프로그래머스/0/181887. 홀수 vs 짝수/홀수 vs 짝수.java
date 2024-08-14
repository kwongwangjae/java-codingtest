class Solution {
    public int solution(int[] num_list) {
        int hap1 = 0;
        int hap2 = 0;
        for(int i = 0; i < num_list.length; i++){
            if(i % 2 == 0){
                hap1 += num_list[i];
            }else{
                hap2 += num_list[i];
            }
        }
        return hap1 >= hap2 ? hap1 : hap2 ;
    }
}