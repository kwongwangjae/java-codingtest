class Solution {
    public int solution(int price) {
        if (price < 100000) {
            return price;
        } else if (price < 300000) {
            return (int) (price * 0.95f);
        } else if (price < 500000) {
            return (int) (price * 0.9f);
        } else {
            return (int) (price * 0.8f);
        }
    }
}
