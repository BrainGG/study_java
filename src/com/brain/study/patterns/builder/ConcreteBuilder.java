/**
 * 
 */
package com.brain.study.patterns.builder;

/**
 * ConcrectBuilder
 * @author Brain
 * @date 2014-12-7
 */
public class ConcreteBuilder extends Builder {

	private Product product = new Product();

	/**
	 * 
	 */
	public ConcreteBuilder() {
	}

	@Override
	public void buildPartA() {
		product.setObjectA(new Object());
	
	}
	


	@Override
	public void buildPartB() {
		product.setObjectB(new Object());
	}
	
	
	public Product getResult() {
		return product;
	}
}
