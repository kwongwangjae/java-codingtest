import java.util.HashSet;

class Solution {
    public int solution(int[] elements) {
        int n = elements.length;
        int[] linearSeq = new int[n * 2];
        for (int i = 0; i < n; i++) {
            linearSeq[i] = elements[i];
            linearSeq[i + n] = elements[i];
        }

        HashSet<Integer> sumSet = new HashSet<>();

        // 모든 부분 수열의 합 계산
        for (int start = 0; start < n; start++) {
            for (int len = 1; len <= n; len++) {
                int sum = 0;
                for (int i = start; i < start + len; i++) {
                    sum += linearSeq[i];
                }
                sumSet.add(sum);
            }
        }

        return sumSet.size();
    }
}
