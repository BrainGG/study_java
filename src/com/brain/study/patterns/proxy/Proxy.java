/**
 * 
 */
package com.brain.study.patterns.proxy;


/**
 * Proxy
 * @author Brain
 * @date 2014-12-8
 */
public class Proxy implements Subject {

	private Subject subject = null;
	
	public Proxy (Subject subject)  {
		this.subject = subject;
	}
	
	@Override
	public void request() {
		if (this.subject != null) {
//			this.subject.request();
		}
	}
}