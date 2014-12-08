/**
 * 
 */
package com.brain.study.patterns.visitor;

/**
 * ConcreteVisitor1
 * @author Brain
 * @date 2014-12-8
 */
public class ConcreteVisitor2 implements Visitor {


	@Override
	public void visitConcreteElementA(ConcreteElementA e) {
		e.operationA();
		
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB e) {
		e.operationB();
	}
	

	@Override
	public void visitStringElement(StringElement e) {
		@SuppressWarnings("unused")
		String stringValue = e.getValue();
	}


}
