/**
 * 
 */
package com.brain.study.concurrency.semaphore;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * PrintQueue
 * @author Brain
 * @date 2014-12-8
 */
public class PrintQueue {

	private final Semaphore semaphore;
	
	public PrintQueue() {
		semaphore = new Semaphore(2, true);
	}
	
	public void printJob(Object document) {
		try {
			semaphore.acquire();
			long duration = (long)(Math.random() * 10);
			System.out.printf("%s: %d\n", Thread.currentThread(), duration);
			TimeUnit.SECONDS.sleep(duration);
		} catch(InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaphore.release();
		}
	}
}
