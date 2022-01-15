package gaurav.tree;

import java.util.ArrayList;
import java.util.List;

import gaurav.tree.PreOrderTraversal.TreeNode;

public class BoundryOfBinaryTree545 {

	public List<Integer> boundaryOfBinaryTree(TreeNode root) {

		List<Integer> result = new ArrayList<>();
		result.add(root.val);
		if (isLeaf(root)) {
			return result;
		}
		getLeftNodes(root.left, result);
		getLeafNodes(root, result);
		getRightNodes(root.right, result);

		return result;
	}

	public boolean isLeaf(TreeNode root) {
		return root.left == null && root.right == null;
	}

	public List<Integer> getLeftNodes(TreeNode root, List<Integer> result) {
		if (root == null)
			return null;

		if (!isLeaf(root)) {
			result.add(root.val);
		}

		if (root.left != null) {
			return getLeftNodes(root.left, result);
		}
		return getLeftNodes(root.right, result);

	}

	public void getLeafNodes(TreeNode root, List<Integer> result) {
		if (isLeaf(root)) {
			result.add(root.val);
			return;
		}

		if (root.left != null)
			getLeafNodes(root.left, result);
		if (root.right != null)
			getLeafNodes(root.right, result);

	}

	public List<Integer> getRightNodes(TreeNode root, List<Integer> result) {
		if (root == null)
			return null;
		if (root.right != null) {
			getRightNodes(root.right, result);
		} else if (root.left != null) {
			getRightNodes(root.left, result);
		}
		if (!isLeaf(root)) {
			result.add(root.val);
		} else {
			return null;
		}

		return result;
	}
}
