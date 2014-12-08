/**
 * 
 */
package com.brain.study.patterns.cmd_chainofresponsibility;

/**
 * ConcreteCommand
 * @author Brain
 * @date 2014-12-8
 */
public class ConcreteCommand implements Command {
	private Handler handler = null;

	@SuppressWarnings("unused")
	private String state;

	public ConcreteCommand(Handler handler) {
		this.handler = handler;
	}

	@Override
	public void execute() {
		if (handler != null) {
			handler.handleRequest();
		}
	}

}
