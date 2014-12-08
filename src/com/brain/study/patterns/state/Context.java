/**
 * 
 */
package com.brain.study.patterns.state;

/**
 * Context
 * @author Brain
 * @date 2014-12-8
 */
public class Context {
	private State state = null; 

	
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	
	
	public void request() {
		if (state != null) {
			state.handle();
		}
	}
}
