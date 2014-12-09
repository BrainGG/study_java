/**
 * 
 */
package com.brain.study.algorithm.tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * BinaryTree
 * 
 * @author Brain
 * @date 2014-12-9
 */
public class BinaryTree<T> {
	private BinaryTreeNode<T> root;
	private NodeVisitListener visitListener;

	public void setVisitListener(NodeVisitListener visitListener) {
		this.visitListener = visitListener;
	}

	/**
	 * Gets node count in the binary tree
	 * 
	 * @return node count in the binary tree
	 */
	public int getNodeCount() {
		return getNodeCount(root);
	}

	/**
	 * Gets depth of the binary tree
	 * 
	 * @return depth of the binary tree
	 */
	public int getDepth() {
		return getDepth(root);
	}

	/**
	 * Preorder traversal the binary tree
	 */
	public void preorderTraverse() {
		preorderTraverse(root);
	}

	/**
	 * Inorder traversal the binary tree
	 */
	public void inorderTraverse() {
		inorderTraverse(root);
	}

	/**
	 * Postorder traversal the binary tree
	 */
	public void postorderTraverse() {
		postorderTraverse(root);
	}

	/**
	 * Breadth first traversal the binary tree
	 */
	public void levelTraverse() {
		levelTraverse(root);
	}

	/**
	 * Gets node count in a level
	 * @param the number of level 
	 * @return node count
	 */
	public int getNodeCountLevel(int level) {
		return getNodeCountLevel(root, level);
	}

	/**
	 * Gets leaf node count 
	 * @return leaf node count 
	 */
	public int getLeafNodeCount() {
		return getLeafNodeCount(root);
	}

	/**
	 * compare two binary tree structure
	 * @param otherTree
	 * @return
	 */
	public boolean compareStructure(BinaryTreeNode<T> otherTree) {
		return compareStructure(root, otherTree);
	}

	private void preorderTraverse(BinaryTreeNode<?> root) {
		if (root == null) {
			return;
		}
		visit(root);
		preorderTraverse(root.getLeftRoot());
		preorderTraverse(root.getRightRoot());
	}

	private void postorderTraverse(BinaryTreeNode<?> root) {
		if (root == null) {
			return;
		}
		postorderTraverse(root.getLeftRoot());
		postorderTraverse(root.getRightRoot());
		visit(root);
	}

	private void inorderTraverse(BinaryTreeNode<?> root) {
		if (root == null) {
			return;
		}
		inorderTraverse(root.getLeftRoot());
		visit(root);
		inorderTraverse(root.getRightRoot());
	}

	private void levelTraverse(BinaryTreeNode<T> root) {
		if (root == null) {
			return;
		}
		Queue<BinaryTreeNode<T>> queue = new LinkedList<BinaryTreeNode<T>>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			BinaryTreeNode<T> node = queue.poll();
			visit(node);
			if (node.hasLeftRoot()) {
				queue.offer(node.getLeftRoot());
			}
			if (node.hasRightRoot()) {
				queue.offer(node.getRightRoot());
			}
		}
	}

	private int getNodeCountLevel(BinaryTreeNode<T> root, int level) {
		if (root == null || level < 1) {
			return 0;
		} else if (level == 1) {
			return 1;
		} else {
			int leftCount = getNodeCountLevel(root.getLeftRoot(), level - 1);
			int rightCount = getNodeCountLevel(root.getRightRoot(), level - 1);
			return leftCount + rightCount;
		}
	}

	private int getLeafNodeCount(BinaryTreeNode<T> root) {
		if (root == null) {
			return 0;
		} else if (!root.hasLeftRoot() && !root.hasRightRoot()) {
			return 1;
		} else {
			int leftCount = getLeafNodeCount(root.getLeftRoot());
			int rightCount = getLeafNodeCount(root.getRightRoot());
			return leftCount + rightCount;
		}
	}

	private void visit(BinaryTreeNode<?> node) {
		if (visitListener != null) {
			visitListener.onVisitNode(node);
		}
	}

	private int getDepth(BinaryTreeNode<?> root) {
		if (root == null) {
			return 0;
		} else {
			return Math.max(getDepth(root.getLeftRoot()),
					getDepth(root.getRightRoot())) + 1;
		}
	}

	private int getNodeCount(BinaryTreeNode<?> root) {
		if (root == null) {
			return 0;
		} else {
			return getNodeCount(root.getLeftRoot())
					+ getNodeCount(root.getRightRoot()) + 1;
		}
	}

	private boolean compareStructure(BinaryTreeNode<T> root,
			BinaryTreeNode<T> otherRoot) {
		if (root == null && otherRoot == null) {
			return true;
		} else if (root == null || otherRoot == null) {
			return false;
		} else {
			boolean leftEqual = compareStructure(root.getLeftRoot(),
					otherRoot.getLeftRoot());
			boolean rightEqual = compareStructure(root.getRightRoot(),
					otherRoot.getRightRoot());

			return leftEqual && rightEqual;
		}
	}

}
