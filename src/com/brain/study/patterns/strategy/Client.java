package com.brain.study.patterns.strategy;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Context context = new Context();
		Strategy strategy = new ConcreteStrategyA();
		context.setStrategy(strategy);
		context.contextInterface();
	}

}
