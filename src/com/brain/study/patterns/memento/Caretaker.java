package com.brain.study.patterns.memento;

/**
 * Caretaker
 * 
 * @author Brain
 * @date 2014-12-8
 */
public class Caretaker {
	private Memento memento;

	public void setMemento(Memento memento) {
		this.memento = memento;
	}

	public Memento getMemento() {
		return memento;
	}
}
