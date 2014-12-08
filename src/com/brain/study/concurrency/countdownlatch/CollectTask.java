package com.brain.study.concurrency.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * CollectTask
 * 
 * @author Brain
 * @date 2014-12-8
 */
public class CollectTask implements Runnable {

	private final CountDownLatch countLatch;

	public CollectTask(int count) {
		countLatch = new CountDownLatch(count);
	}

	public void completedJob(Job job) {
		System.out.println(job.getName() + " completed.");
		countLatch.countDown();
	}

	@Override
	public void run() {
		System.out.println("CollectTask run s");

		try {
			System.out.println("CollectTask await");
			countLatch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		doSomething();
		System.out.println("CollectTask run e");

	}

	private void doSomething() {
		System.out.println("doSomething");
	}
}
