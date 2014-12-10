package com.brain.study.algorithm.tree.binarytree.test;

import java.util.LinkedList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.brain.study.algorithm.tree.binarytree.BinaryTree;
import com.brain.study.algorithm.tree.binarytree.BinaryTreeNode;
import com.brain.study.algorithm.tree.binarytree.NodeVisitListener;

public class TestBinaryTree {

	private static BinaryTree<String> binaryTree = new BinaryTree<String>();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
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

		binaryTree.setVisitListener(new NodeVisitListener() {

			@Override
			public void onVisitNode(BinaryTreeNode<?> node) {
				System.out.println(node.getData());
			}
		});
		binaryTree.buildTree(dataQueue);

	}

	@After
	public void tearDown() throws Exception {
	}

	
	public void testPostorderTraverse() {
		binaryTree.postorderTraverseW();
	}

	@Test
	public void testPreorderTraverse() {
		binaryTree.preorderTraverseW();
	}

}
