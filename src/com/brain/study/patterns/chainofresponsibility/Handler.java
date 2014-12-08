/**
 * 
 */
package com.brain.study.patterns.chainofresponsibility;

/**
 * Handler
 * 
 * @author Brain
 * @date 2014-12-8
 */
public abstract class Handler {

	protected Handler successor;

	public Handler getSuccessor() {
		return successor;
	}

	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	
	public abstract void handleRequest();
}