package com.brain.study.patterns.memento;

/**
 * Originator
 * @author Brain
 * @date 2014-12-8
 */
public class Originator {

	private Object state;

	public void setMemento(Memento memento) {
		state = memento.getState();
	}
	
	public Memento createMemento() {
		return new Memento(state);
	}

	public void someOperation() {
		// TODO Auto-generated method stub
	}
}
