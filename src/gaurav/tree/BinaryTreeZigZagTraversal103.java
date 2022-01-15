package gaurav.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import gaurav.tree.PreOrderTraversal.TreeNode;

public class BinaryTreeZigZagTraversal103 {

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		if (root == null)
			return result;
		Queue<TreeNode> queue = new LinkedList<>();
		TreeNode node = root;
		queue.offer(node);
		boolean isLeftToRight = true;
		while (!queue.isEmpty()) {
			int size = queue.size();
			List<Integer> list = new ArrayList<>(2000);
			for (int i = 0; i < size; i++) {
				TreeNode top = queue.poll();
				if (top.left != null)
					queue.offer(top.left);
				if (top.right != null)
					queue.offer(top.right);
				list.add(top.val);

			}

			if (!isLeftToRight) {
				Collections.reverse(list);
			}
			isLeftToRight = !isLeftToRight;
			result.add(list);
		}
		return result;
	}
}
