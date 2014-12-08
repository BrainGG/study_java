/**
 * 
 */
package com.brain.study.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject
 * 
 * @author Brain
 * @date 2014-12-8
 */
public class Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	public void addObserver(Observer observer) { // attach
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {// detach
		observers.remove(observer);

	}

	public void notifyObserver() {
		for (Observer o : observers) {
			o.update();
		}
	}
}
