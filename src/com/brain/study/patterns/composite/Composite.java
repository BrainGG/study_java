/**
 * 
 */
package com.brain.study.patterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * AbsComponent
 * @author Brain
 * @date 2014-12-7
 */
public class Composite implements Component {

	private List<Component> components = new ArrayList<Component>();
	
	/**
	 * 
	 */
	public Composite() {
		// TODO Auto-generated constructor stub
	}


	/* (non-Javadoc)
	 * @see com.brain.study.patterns.composite.Component#operation()
	 */
	@Override
	public void operation() {
		for (Component c : components) {
			c.operation();
		}
	    doSomething();
	}


	@Override
	public void addComponent(Component component) {
		components.add(component);		
	}

	@Override
	public void removeCommponent(Component component) {
		components.add(component);		
	}

	@Override
	public Component getChild(int i) {
		return components.get(i);
	}


	private void doSomething() {
		// TODO Auto-generated method stub
		
	}

}
