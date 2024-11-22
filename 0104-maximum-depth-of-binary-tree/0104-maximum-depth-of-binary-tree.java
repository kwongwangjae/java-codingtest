import java.util.LinkedList;
import java.util.Queue;

class Solution {
	public int maxDepth(TreeNode root) {
		if(root == null)return 0;

		Queue<TreeNode> queue = new LinkedList<>();

		queue.add(root);
		System.out.println(root);

		int depth = 0;

		while (!queue.isEmpty()) {
			depth += 1;
			int q_size = queue.size();

			for (int i = 0; i < q_size; i++) {
				TreeNode cur = queue.poll();
				if (cur.left != null) {
					queue.add(cur.left);
				}
				if (cur.right != null) {
					queue.add(cur.right);
				}
			}
		}

		return depth;

	}

}