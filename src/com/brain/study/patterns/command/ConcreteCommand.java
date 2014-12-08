/**
 * 
 */
package com.brain.study.patterns.command;

/**
 * ConcreteCommand
 * @author Brain
 * @date 2014-12-8
 */
public class ConcreteCommand implements Command {
	private Receiver receiver = null;

	@SuppressWarnings("unused")
	private String state;

	public ConcreteCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.action();
	}

}
