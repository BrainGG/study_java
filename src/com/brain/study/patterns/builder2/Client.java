package com.brain.study.patterns.builder2;

public class Client {
	public static void main(String[] args) {
		Builder builder = new ConcreteBuilderA();
		Director director = new Director(builder);
		director.construct();
		Product product = builder.getResult();
		product.doSomething();
	}
}
