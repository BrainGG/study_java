package com.brain.study.patterns.memento;

public class Client {
	public static void main(String[] args) {
		Originator originator = new Originator();

		Caretaker caretaker = new Caretaker();

		caretaker.setMemento(originator.createMemento());

		originator.someOperation();

		originator.setMemento(caretaker.getMemento());
	}

}
