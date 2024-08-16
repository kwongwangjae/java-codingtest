	class Solution {
		public int solution(int[] arr1, int[] arr2) {
			int h1 = 0;
			int h2 = 0;

			if (arr1.length > arr2.length) {
				return 1;
			}else if(arr1.length < arr2.length){
				return -1;
			}

			for (int i = 0; i < arr1.length; i++) {
				h1 += arr1[i];
				h2 += arr2[i];
			}

			if (h1 > h2) {
				return 1;
			}else if(h2 > h1){
				return -1;
			}else {
				return 0;
			}
		}
	}