class Solution {
    public int solution(int[][] sizes) {
        int max = 0;
        int min = 0;
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] >= sizes[i][1]){
                if(max < sizes[i][0]){
                    max = sizes[i][0];
                } 
                if(min < sizes[i][1]){
                    min = sizes[i][1];
                }
            } else{
                if(max < sizes[i][1]){
                    max = sizes[i][1];
                } 
                if(min < sizes[i][0]){
                    min = sizes[i][0];
                }
            }
        }
        return max * min;
    }
}
