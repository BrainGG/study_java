/**
 * 
 */
package com.brain.study.patterns.abstractfactory;

/**
 * ConcreteFactory1
 * @author Brain
 * @date 2014-12-8
 */
public class ConcreteFactory1 implements AbstractFactory {

	/**
	 * 
	 */
	public ConcreteFactory1() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.brain.study.patterns.abstractfactory.AbstractFactory#createProductA()
	 */
	@Override
	public AbstractProductA createProductA() {
		return new ProductA1();
	}

	/* (non-Javadoc)
	 * @see com.brain.study.patterns.abstractfactory.AbstractFactory#createProductB()
	 */
	@Override
	public AbstractProductB createProductB() {
		return new ProductB1();
	}

}
