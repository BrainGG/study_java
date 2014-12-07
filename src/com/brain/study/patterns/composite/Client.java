package com.brain.study.patterns.composite;

public class Client {

	public static void main(String[] args) {
		Component root = new Composite();
		Component c1 = new Composite();
		Component c21 = new Composite();
		Component c22 = new Composite();
		Component c23 = new Composite();
		Component c3 = new Composite();
		Component l3 = new Composite();

		c1.addComponent(c21);
		c1.addComponent(c22);
		c1.addComponent(c23);

		c22.addComponent(l3);
		c22.addComponent(c3);
	
		
		root.addComponent(c1);
		root.operation();
	}

}
