package gaurav.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import gaurav.tree.PreOrderTraversal.TreeNode;

public class InOrderTraversal94 {

	// recursion
	public static void inOrder(TreeNode node) {
		if (node == null)
			return;

		inOrder(node.left);
		System.out.println(node.val);
		inOrder(node.right);
	}

	public List<Integer> inorderTraversal(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		List<Integer> result = new ArrayList<>();
		TreeNode node = root;

		while (true) {
			if (node != null) {
				stack.push(node);
				node = node.left;
			} else {
				if (stack.isEmpty())
					break;
				node = stack.pop();
				result.add(node.val);
				node = node.right;
			}
		}

		return result;
	}
}
