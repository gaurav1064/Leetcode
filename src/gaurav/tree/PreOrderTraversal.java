package gaurav.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversal {

	// recursion
	public static void preOrder(TreeNode node) {
		if (node == null)
			return;

		System.out.println(node.val);
		preOrder(node.left);
		preOrder(node.right);
	}

	// iterative
	public List<Integer> preorderTraversal(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		List<Integer> result = new ArrayList<>();
		if (root == null)
			return result;

		stack.push(root);

		while (!stack.isEmpty()) {
			TreeNode top = stack.pop();
			if (top.right != null)
				stack.push(top.right);
			if (top.left != null)
				stack.push(top.left);

			result.add(top.val);
		}

		return result;
	}

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
	}
}
