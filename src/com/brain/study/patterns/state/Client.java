package com.brain.study.patterns.state;

public class Client {
	public static void main(String[] args) {
		Context context = new Context();
		State state = new ConcreteStateA();
		context.setState(state);
		context.request();
	}

}
