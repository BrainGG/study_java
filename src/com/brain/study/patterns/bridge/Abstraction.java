/**
 * 
 */
package com.brain.study.patterns.bridge;

/**
 * Abstraction
 * @author Brain
 * @date 2014-12-7
 */
public abstract class Abstraction {

	private Implementor imp = null;
	
	/**
	 * 
	 */
	public Abstraction() {
		// TODO Auto-generated constructor stub
	}
	
	public void setImplementor(Implementor imp) {
		this.imp = imp;
	}
	
	protected void operation() {
		if (this.imp != null) {
			this.imp.operationImpl();
		}
	}

}
