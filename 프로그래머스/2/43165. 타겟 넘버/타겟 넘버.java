class Solution {
    int count = 0;
    
    public void dfs(int[] numbers, int target, int num, int hap, int depth){
        if(num == depth){
            if(hap == target)count++;
            return;
        }
        
        dfs(numbers, target, num, hap + numbers[depth], depth + 1);
        dfs(numbers, target, num, hap - numbers[depth], depth + 1);
        
        
        
    }
    
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, numbers.length, 0, 0);
        return count;
    }
}