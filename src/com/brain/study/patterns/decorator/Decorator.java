/**
 * 
 */
package com.brain.study.patterns.decorator;

/**
 * Decorator
 * @author Brain
 * @date 2014-12-7
 */
public class Decorator implements Component {

	protected Component component;

	
	public Decorator(Component component) {
		this.component = component;
	}

	@Override
	public void operation() {
		if (this.component != null) {
			this.component.operation();
		}
	}
}
