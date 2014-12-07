/**
 * 
 */
package com.brain.study.patterns.adapter2;

/**
 * Adapter
 * @author Brain
 * @date 2014-12-7
 */
public class Adapter extends Target {

	private Adaptee adaptee = null;
	
	/**
	 * 
	 */
	public Adapter(Adaptee adaptee) {
		if(adaptee == null) {
			throw new IllegalArgumentException("adaptee can't be null.");
		}
		this.adaptee = adaptee;
	}

	@Override
	public void request() {
		this.adaptee.specificRequest();
	}
}
