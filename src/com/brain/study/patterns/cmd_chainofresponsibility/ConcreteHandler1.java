/**
 * 
 */
package com.brain.study.patterns.cmd_chainofresponsibility;

/**
 * ConcreteHandler1 
 * @author Brain
 * @date 2014-12-8
 */
public class ConcreteHandler1 extends Handler {

	public ConcreteHandler1() {
	}

	@Override
	public void handleRequest() {
		if(successor != null) {
			successor.handleRequest();
		}
	}

}
