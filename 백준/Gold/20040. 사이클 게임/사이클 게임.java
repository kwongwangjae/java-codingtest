import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

class Main {
	static int[] parent;

	public int find(int x){
		if(parent[x] == x)return x;
		return parent[x] = find(parent[x]);
	}

	public void union(int a, int b){
		int A = find(a);
		int B = find(b);
		if(A != B){
			parent[B] = A;
		}
	}

	public int solution(int n, int m, int[][] nums) {
		parent = new int[n];
		for (int i = 0; i < n; i++) {
			parent[i] = i;
		}

		for (int turn = 1; turn <= m; turn++) {
			int a = nums[turn - 1][0];
			int b = nums[turn - 1][1];
			if (find(a) == find(b)) {
				return turn;
			}
			union(a, b);
		}

		return 0;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int N = kb.nextInt();
		int M = kb.nextInt();
		int[][] num = new int[M][2];
		for(int i = 0; i < M; i++){
			num[i][0] = kb.nextInt();
			num[i][1] = kb.nextInt();
		}


		System.out.println(T.solution(N, M, num));
	}
}
