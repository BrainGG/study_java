/**
 * 
 */
package com.brain.study.patterns.factorymethod;

/**
 * ConcreteCreator
 * @author Brain
 * @date 2014-12-8
 */
public class ConcreteCreator implements Creator {
	@Override
	public Product createProduct() {
		return new ConcreteProduct();
	}

}
