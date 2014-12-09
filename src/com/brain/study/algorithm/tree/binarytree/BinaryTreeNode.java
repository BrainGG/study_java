/**
 * 
 */
package com.brain.study.algorithm.tree.binarytree;

/**
 * BinaryTreeNode
 * 
 * @author Brain
 * @date 2014-12-9
 */
public class BinaryTreeNode<T> {
	private T data;
	private BinaryTreeNode<T> leftRoot;
	private BinaryTreeNode<T> rightRoot;

	/**
	 * 
	 */
	public BinaryTreeNode() {
		// TODO Auto-generated constructor stub
	}

	public BinaryTreeNode(T data) {
		this(data, null, null);
	}

	public BinaryTreeNode(T data, BinaryTreeNode<T> leftRoot,
			BinaryTreeNode<T> rightRoot) {
		this.data = data;
		this.leftRoot = leftRoot;
		this.rightRoot = rightRoot;
	}

	public BinaryTreeNode<T> getLeftRoot() {
		return leftRoot;
	}

	public void setLeftRoot(BinaryTreeNode<T> leftRoot) {
		this.leftRoot = leftRoot;
	}

	public BinaryTreeNode<T> getRightRoot() {
		return rightRoot;
	}

	public void setRightRoot(BinaryTreeNode<T> rightRoot) {
		this.rightRoot = rightRoot;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public boolean hasLeftRoot() {
		return this.leftRoot != null;
	}

	public boolean hasRightRoot() {
		return this.rightRoot != null;
	}

}
