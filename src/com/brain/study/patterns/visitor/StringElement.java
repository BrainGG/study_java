/**
 * 
 */
package com.brain.study.patterns.visitor;

/**
 * ConcreteElementA
 * 
 * @author Brain
 * @date 2014-12-8
 */
public class StringElement implements Element {
	private String value;

	public StringElement(String string) {
		value = string;
	}

	public String getValue() {
		return value;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitStringElement(this);
	}

}
