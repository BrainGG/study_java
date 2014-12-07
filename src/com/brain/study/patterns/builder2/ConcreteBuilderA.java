/**
 * 
 */
package com.brain.study.patterns.builder2;

/**
 * ConcrectBuilder
 * @author Brain
 * @date 2014-12-7
 */
public class ConcreteBuilderA implements Builder {

	private Product product = new ConcreteProductA();

	/**
	 * 
	 */
	public ConcreteBuilderA() {
	}

	@Override
	public Builder buildPartA() {
		product.setObjectA(new Object());
		return this;
	}
	


	@Override
	public Builder buildPartB() {
		product.setObjectB(new Object());
		return this;
	}
	
	
	

	@Override
	public Builder appendPart(Object obj) {
		// TODO Auto-generated method stub
		return this;
	}
	
	@Override
	public Product getResult() {
		return product;
	}
}
