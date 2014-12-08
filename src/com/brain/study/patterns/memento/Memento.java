package com.brain.study.patterns.memento;

/**
 * Memento
 * 
 * @author Brain
 * @date 2014-12-8
 */
public class Memento {
	private Object state = null;

	public Memento() {
	}

	public Memento(Object state) {
		setState(state);
	}

	public Object getState() {
		return state;
	}

	public void setState(Object state) {
		this.state = state;
	}

}
