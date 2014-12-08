/**
 * 
 */
package com.brain.study.patterns.visitor;

/**
 * Element
 * @author Brain
 * @date 2014-12-8
 */
public interface Element {
	void accept(Visitor visitor);
}
