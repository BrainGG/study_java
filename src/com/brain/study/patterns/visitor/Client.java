package com.brain.study.patterns.visitor;


public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Visitor visitor = new ConcreteVisitor1();

		StringElement stringE = new StringElement("I am a String");
		visitor.visitStringElement(stringE); 
		visitor.visitConcreteElementA(new ConcreteElementA());
		visitor.visitConcreteElementB(new ConcreteElementB());
	}

}
