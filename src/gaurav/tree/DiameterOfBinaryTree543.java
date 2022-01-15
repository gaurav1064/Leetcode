package gaurav.tree;

import gaurav.tree.PreOrderTraversal.TreeNode;

public class DiameterOfBinaryTree543 {

	private int result = 0;

	public int diameterOfBinaryTree(TreeNode root) {

		getHeight(root);
		return result;

	}

	public int getHeight(TreeNode root) {
		if (root == null)
			return 0;

		int lh = getHeight(root.left);
		int rh = getHeight(root.right);

		result = Math.max(result, lh + rh);
		return Math.max(lh, rh) + 1;
	}
}
