class Solution {
	public long solution(int price, int money, int count) {
		long p = price;
		long m = money;
		for (int i = 0; i < count; i++) {
			m -= p;
			p += price;
		}

		return m > 0 ? 0 : Math.abs(m);
	}
}