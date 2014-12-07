package com.brain.study.patterns.bridge;

public class Client {

	public static void main(String[] args) {
		Abstraction abstraction = new RefinedAbstraction();
		abstraction.setImplementor(new ConcreteImplementorA());
		abstraction.operation();
		
		abstraction.setImplementor(new ConcreteImplementorB());
		abstraction.operation();
	}

}
