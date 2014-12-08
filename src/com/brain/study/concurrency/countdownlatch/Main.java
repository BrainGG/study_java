package com.brain.study.concurrency.countdownlatch;

public class Main {
	public static void main(String[] args) {
		int jobCount = 10;
		CollectTask task = new CollectTask(jobCount);
		new Thread(task).start();

		for (int i = 0; i < jobCount; i++) {
			new Thread(new Job(task)).start();
		}
	}
}
