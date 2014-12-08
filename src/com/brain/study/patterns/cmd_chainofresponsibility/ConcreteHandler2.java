/**
 * 
 */
package com.brain.study.patterns.cmd_chainofresponsibility;

/**
 * ConcreteHandler2 
 * @author Brain
 * @date 2014-12-8
 */
public class ConcreteHandler2 extends Handler {

	public ConcreteHandler2() {
	}

	@Override
	public void handleRequest() {
		if(successor != null) {
			successor.handleRequest();
		}
	}
}
