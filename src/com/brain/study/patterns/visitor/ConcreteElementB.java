/**
 * 
 */
package com.brain.study.patterns.visitor;

/**
 * ConcreteElementA
 * @author Brain
 * @date 2014-12-8
 */
public class ConcreteElementB implements Element{


	public void operationB() {
	}


	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementB(this);
	}

}
