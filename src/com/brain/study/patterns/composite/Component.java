/**
 * 
 */
package com.brain.study.patterns.composite;

/**
 * Component
 * @author Brain
 * @date 2014-12-7
 */
public interface Component {
	void addComponent(Component component);
	void removeCommponent(Component component);
	Component getChild(int i);
	void operation();
}
