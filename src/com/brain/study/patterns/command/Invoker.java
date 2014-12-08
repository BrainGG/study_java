/**
 * 
 */
package com.brain.study.patterns.command;

/**
 * Invoker
 * @author Brain
 * @date 2014-12-8
 */
public class Invoker {
	private Command command = null;
	// private List<Command> commandPool
	public void setCommand(Command command) {
		this.command = command;
	}

	//**sort, remove, undo and log for command object **
	
	public void execute() {
		command.execute();
	}
}
