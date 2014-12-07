package com.brain.study.patterns.builder;

public class Client {
	public static void main(String[] args) {
		ConcrectBuilder builder = new ConcrectBuilder();
		Director director = new Director(builder);
		director.construct();
		Product product = builder.getResult();
		product.doSomething();
	}
}
