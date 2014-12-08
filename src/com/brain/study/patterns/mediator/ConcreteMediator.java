/**
 * 
 */
package com.brain.study.patterns.mediator;

/**
 * ConcreteMediator
 * 
 * @author Brain
 * @date 2014-12-8
 */
public class ConcreteMediator extends Mediator {
	private ConcreteColleague1 c1;
	private ConcreteColleague2 c2;

	public void createConcreteMediator() {
		c1 = new ConcreteColleague1(this);
		c2 = new ConcreteColleague2(this);
	}

	@Override
	public void colleagueChanged(Colleague colleage) {
		c1.action();
		c2.action();
	}
}
