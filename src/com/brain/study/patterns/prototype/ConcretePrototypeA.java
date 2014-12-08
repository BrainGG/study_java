/**
 * 
 */
package com.brain.study.patterns.prototype;

/**
 * ConcretePrototype
 * @author Brain
 * @date 2014-12-8
 */
public class ConcretePrototypeA implements  Prototype {

	public ConcretePrototypeA() {
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}


}
