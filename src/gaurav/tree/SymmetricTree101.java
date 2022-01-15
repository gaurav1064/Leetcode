package gaurav.tree;

import gaurav.tree.PreOrderTraversal.TreeNode;

public class SymmetricTree101 {

	public boolean isSymmetric(TreeNode root) {
		if (root == null)
			return false;

		return checkSymmetry(root.left, root.right);
	}

	public boolean checkSymmetry(TreeNode left, TreeNode right) {
		if (left == null || right == null)
			return left == right;

		if (left.val != right.val)
			return false;

		return checkSymmetry(left.left, right.right) && checkSymmetry(left.right, right.left);
	}
}
