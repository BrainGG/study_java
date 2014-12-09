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

	public BinaryTree() {

	}

	public BinaryTree<T> addNode(T data) {
		if (root == null) {
			root = new BinaryTreeNode<T>(data);
		}

		return this;
	}

	/**
	 * 
	 * @param dataQueue
	 */
	public void buildTree(LinkedList<T> dataQueue) {
		root = createTree(root, dataQueue);
	}

	/**
	 * 
	 * @param node
	 * @param dataQueue
	 * @return
	 */
	private BinaryTreeNode<T> createTree(BinaryTreeNode<T> node,
			LinkedList<T> dataQueue) {
		if (dataQueue == null) {
			return null;
		}
		T data = dataQueue.poll();
		if (data == null) {
			return null;
		} else {
			node = new BinaryTreeNode<T>(data);
			node.setLeftRoot(createTree(node.getLeftRoot(), dataQueue));
			node.setRightRoot(createTree(node.getRightRoot(), dataQueue));
			return node;
		}
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
	 * 
	 * @param the
	 *            number of level
	 * @return node count
	 */
	public int getNodeCountLevel(int level) {
		return getNodeCountLevel(root, level);
	}

	/**
	 * Gets leaf node count
	 * 
	 * @return leaf node count
	 */
	public int getLeafNodeCount() {
		return getLeafNodeCount(root);
	}

	/**
	 * compare two binary tree structure
	 * 
	 * @param otherTree
	 * @return
	 */
	public boolean compareStructure(BinaryTreeNode<T> otherTree) {
		return compareStructure(root, otherTree);
	}

	/**
	 * find a node by data
	 * 
	 * @param data
	 * @return node
	 */
	public BinaryTreeNode<T> find(T data) {
		return find(root, data);
	}

	/**
	 * The exchange all left and right subtree
	 * 
	 * @return this tree
	 */
	public BinaryTree<T> mirror() {
		mirror(root);
		return this;
	}
	/**
	 * remove all node and sets root to null
	 */
	public void clear() {
		clear(root);
		root = null;
	}
	/**
	 * Is completed binary tree.
	 * @return
	 */
	public boolean isCompletedBinaryTree() {
		return isCompletedBinaryTree(root);
	}
	private BinaryTreeNode<T> find(BinaryTreeNode<T> root, T data) {
		if (root == null || data == null) {
			return null;
		}

		if (root.getData().equals(data)) {
			return root;
		} else {
			BinaryTreeNode<T> node = find(root.getLeftRoot(), data);
			if (node != null) {
				return node;
			}

			node = find(root.getRightRoot(), data);
			if (node != null) {
				return node;
			}
			return null;
		}
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

	private BinaryTreeNode<T> mirror(BinaryTreeNode<T> root) {
		if (root == null) {
			return null;
		}

		BinaryTreeNode<T> leftRoot = mirror(root.getLeftRoot());
		BinaryTreeNode<T> rightRoot = mirror(root.getRightRoot());

		root.setLeftRoot(rightRoot);
		root.setRightRoot(leftRoot);
		return root;
	}

	private void clear(BinaryTreeNode<T> root) {
		if (root == null) {
			return;
		}

		clear(root.getLeftRoot());
		clear(root.getRightRoot());

		root.setData(null);
		root.setLeftRoot(null);
		root.setRightRoot(null);
		root = null;
	}
	
	private boolean isCompletedBinaryTree(BinaryTreeNode<T> root) {
		boolean mustNoChild = false;
		if (root == null) {
			return false;
		}
		Queue<BinaryTreeNode<T>> queue = new LinkedList<BinaryTreeNode<T>>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			BinaryTreeNode<T> node = queue.poll();
			if (node.hasLeftRoot()) {
				if (mustNoChild) {
					return false;
				}
				queue.offer(node.getLeftRoot());
			} else {
				mustNoChild = true;
			}
			
			if (node.hasRightRoot()) {
				if (mustNoChild) {
					return false;
				}
				queue.offer(node.getRightRoot());
			} else {
				mustNoChild = true;
			}
		}
		return true;
	}
}
