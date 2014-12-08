/**
 * 
 */
package com.brain.study.patterns.mediator;

/**
 * Colleague
 * 
 * @author Brain
 * @date 2014-12-8
 */
public abstract class Colleague {
	private Mediator mediator;

	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}

	public Mediator getMediator() {
		return mediator;
	}

	public abstract void action();
}