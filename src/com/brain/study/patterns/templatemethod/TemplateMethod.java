/**
 * 
 */
package com.brain.study.patterns.templatemethod;

/**
 * TemplateMethod
 * @author Brain
 * @date 2014-12-8
 */
public abstract class TemplateMethod {

	public void doSomething() {
		@SuppressWarnings("unused")
		Object obj =  getPrerequisite();
		// do something
		completed(new Object());
	}

	protected abstract void completed(Object result);
	
	protected abstract Object getPrerequisite();
}
