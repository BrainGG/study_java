/**
 * 
 */
package com.brain.study.patterns.visitor;

/**
 * Visitor
 * 
 * @author Brain
 * @date 2014-12-8
 */
public interface Visitor {
	void visitConcreteElementA(ConcreteElementA e);

	void visitConcreteElementB(ConcreteElementB e);

	void visitStringElement(StringElement e);
}
