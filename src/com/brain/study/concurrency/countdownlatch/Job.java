package com.brain.study.concurrency.countdownlatch;

import java.util.concurrent.TimeUnit;

/**
 * Job
 * 
 * @author Brain
 * @date 2014-12-8
 */
public class Job implements Runnable {

	private String name;
	private CollectTask task;

	public Job(CollectTask task) {
		this.task = task;
	}

	@Override
	public void run() {
		try {
			long duration = (long) (Math.random() * 10);
			TimeUnit.SECONDS.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.name = Thread.currentThread().getName();

		this.task.completedJob(this);
	}

	public String getName() {
		return name;
	}
}
