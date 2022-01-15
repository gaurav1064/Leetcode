package gaurav.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import gaurav.tree.PreOrderTraversal.TreeNode;

public class LevelOrderTraversal102 {
	public List<List<Integer>> levelOrder(TreeNode root) {

		Queue<TreeNode> queue = new LinkedList<>();

		queue.add(root);

		List<List<Integer>> result = new ArrayList<>();
		if (root == null)
			return result;

		while (!queue.isEmpty()) {
			List<Integer> list = new ArrayList<>();
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				if (queue.peek().left != null) {
					queue.add(queue.peek().left);
				}
				if (queue.peek().right != null) {
					queue.add(queue.peek().right);
				}
				list.add(queue.poll().val);
			}

			result.add(list);
		}

		return result;
	}
}
