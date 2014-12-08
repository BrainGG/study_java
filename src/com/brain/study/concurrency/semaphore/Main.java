package com.brain.study.concurrency.semaphore;

public class Main {

	private static final int COUNT_THREAD = 10;

	public static void main(String[] args) {
		PrintQueue printQueue = new PrintQueue();
		Thread[] threads = new Thread[COUNT_THREAD];

		for (int i = 0; i < COUNT_THREAD; i++) {
			threads[i] = new Thread(new Job(printQueue));
		}

		startThreadArray(threads);
	}

	private static void startThreadArray(Thread[] threads) {
		for (Thread t : threads) {
			t.start();
		}
	}
}
