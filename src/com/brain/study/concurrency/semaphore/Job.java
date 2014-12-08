/**
 * 
 */
package com.brain.study.concurrency.semaphore;

/**
 * Job
 * @author Brain
 * @date 2014-12-8
 */
public class Job implements Runnable {

	private PrintQueue printQueue;

	public Job(PrintQueue printQueue) {
		this.printQueue = printQueue;
	}

	@Override
	public void run() {
		System.out.printf("%s: run s\n", Thread.currentThread());
		this.printQueue.printJob(new Object());
		System.out.printf("%s: run e\n", Thread.currentThread());
	}

}
