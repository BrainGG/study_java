/**
 * 
 */
package com.brain.study.algorithm.tree.binarytree;

import java.util.LinkedList;

/**
 * Main
 * @author Brain
 * @date 2014-12-9
 */
public class Main {
	public static void main(String[] args) {
		LinkedList<String> dataQueue = new LinkedList<String>();
		dataQueue.offer("1");
		dataQueue.offer("2");
		dataQueue.offer("4");
		dataQueue.offer("8");
		dataQueue.offer(null);
		dataQueue.offer(null);
		dataQueue.offer(null);
		dataQueue.offer("5");
		dataQueue.offer(null);
		dataQueue.offer(null);
		dataQueue.offer("3");
		dataQueue.offer("6");
		dataQueue.offer(null);
		dataQueue.offer(null);
		dataQueue.offer("7");
		dataQueue.offer(null);
		dataQueue.offer(null);

		BinaryTree<String> bt = new BinaryTree<String>();
		bt.setVisitListener(new NodeVisitListener() {
			
			@Override
			public void onVisitNode(BinaryTreeNode<?> node) {
				System.out.println(node.getData());
			}
		});
		bt.buildTree(dataQueue);

		bt.levelTraverse();
		System.out.println("find(\"7\") " + bt.find("7"));;
		System.out.println("find(\"10\") " + bt.find("10"));;
	}
}
