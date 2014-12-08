package com.brain.study.patterns.cmd_chainofresponsibility;

public class Client {

	public static void main(String[] args) {
		Handler handler1 = new ConcreteHandler1();
		Handler handler2 = new ConcreteHandler2();
		Handler handler3 = new ConcreteHandler3();
		handler1.setSuccessor(handler2);
		handler2.setSuccessor(handler3);
		
		Command command = new ConcreteCommand(handler1);
		Invoker invoker = new Invoker();
		invoker.setCommand(command);
		
		//
		
		invoker.execute();
	}

}
