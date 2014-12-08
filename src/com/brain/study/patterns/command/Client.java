package com.brain.study.patterns.command;

public class Client {
	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command command = new ConcreteCommand(receiver);
		Invoker invoker = new Invoker();
		invoker.setCommand(command);
		
		//
		
		invoker.execute();
	}

}
