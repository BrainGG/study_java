/**
 * 
 */
package com.brain.study.patterns.visitor;

/**
 * ConcreteElementA
 * @author Brain
 * @date 2014-12-8
 */
public class ConcreteElementA implements Element{

	public void operationA() {
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementA(this);
	}

}
