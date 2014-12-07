/**
 * 
 */
package com.brain.study.patterns.builder2;

/**
 * Product
 * @author Brain
 * @date 2014-12-7
 */
public abstract  class Product {

	private Object objectA;
	private Object objectB;
	
	/**
	 * 
	 */
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Object getObjectA() {
		return objectA;
	}

	public void setObjectA(Object objectA) {
		this.objectA = objectA;
	}

	public Object getObjectB() {
		return objectB;
	}

	public void setObjectB(Object objectB) {
		this.objectB = objectB;
	}

	public void doSomething() {
		// TODO Auto-generated method stub
		
	}

}
