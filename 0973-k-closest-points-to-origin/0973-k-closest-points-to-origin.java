import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {

	public class Point{
		double distance;
		int[] point;

		public Point(double distance, int[] point) {
			this.distance = distance;
			this.point = point;
		}
	}
	public int[][] kClosest(int[][] points, int k) {
		int result[][] = new int[k][];
		PriorityQueue<Point> pq = new PriorityQueue<>(Comparator.comparing(a -> a.distance));

		for (int[] point : points) {
			double distance = Math.sqrt((long)point[0] * point[0] + (long)point[1] * point[1]);
			pq.add(new Point(distance, point));
		}

		for (int i = 0; i < k; i++) {
			result[i] = pq.poll().point;
		}

		return result;

	}
}