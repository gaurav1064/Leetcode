package gaurav.tree;

import gaurav.tree.PreOrderTraversal.TreeNode;

public class BinaryTreeMaxPathSum124 {

	private int result = Integer.MIN_VALUE;

	public int maxPathSum(TreeNode root) {
		getSum(root);
		return result;
	}

	public int getSum(TreeNode root) {
		if (root == null)
			return 0;

		int lh = getSum(root.left);
		if (lh < 0)
			lh = 0;
		int rh = getSum(root.right);
		if (rh < 0)
			rh = 0;

		result = Math.max(result, Math.max(root.val, lh + rh + root.val));
		return Math.max(lh, rh) + root.val;
	}
}
