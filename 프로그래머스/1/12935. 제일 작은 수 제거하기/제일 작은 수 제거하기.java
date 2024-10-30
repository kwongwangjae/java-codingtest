class Solution {
	public int[] solution(int[] arr) {
		if(arr.length <= 1)return new int[]{-1};
		int[] answer = new int[arr.length -1];
		int min = Integer.MAX_VALUE;
        int low = 0;

		for (int i = 0; i < arr.length; i++) {
			if(min > arr[i]){
                min = arr[i];
                low = i;
            } 
		}

		for (int i = 0; i < low; i++) {
			answer[i] = arr[i];
		}
		for (int i = low; i < arr.length - 1; i++) {
			answer[i] = arr[i + 1];
		}


		return answer;
	}
}