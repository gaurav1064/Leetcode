package gaurav.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import gaurav.tree.PreOrderTraversal.TreeNode;

public class PostOrderTraversal145 {

	// recursion
	public static void postOrder(TreeNode node) {
		if (node == null)
			return;

		postOrder(node.left);
		postOrder(node.right);
		System.out.println(node.val);
	}

	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		if (root == null)
			return result;

		Stack<TreeNode> s1 = new Stack<>();
		Stack<TreeNode> s2 = new Stack<>();

		s1.push(root);

		while (!s1.isEmpty()) {
			TreeNode t = s1.pop();
			s2.push(t);

			if (t.left != null)
				s1.push(t.left);
			if (t.right != null)
				s1.push(t.right);
		}

		while (!s2.isEmpty()) {
			result.add(s2.pop().val);
		}

		return result;
	}
}
