import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < discount.length - 9; i++) {
            for (int k = 0; k < want.length; k++) {
                map.put(want[k], map.getOrDefault(want[k], 0) + number[k]);
            }

            for (int j = i; j < i + 10; j++) {
                if (map.containsKey(discount[j])) {
                    map.put(discount[j], map.get(discount[j]) - 1);
                }
            }

            boolean allZero = true;
            for (int value : map.values()) {
                if (value != 0) {
                    allZero = false;
                    break;
                }
            }

            if (allZero) {
                answer++;
            }

            map.clear();
        }

        return answer;
    }
}


