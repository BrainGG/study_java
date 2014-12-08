/**
 * 
 */
package com.brain.study.patterns.strategy;

/**
 * Context
 * @author Brain
 * @date 2014-12-8
 */
public class Context {
	private Strategy state = null; 

	
	public Strategy getState() {
		return state;
	}
	public void setStrategy(Strategy state) {
		this.state = state;
	}
	
	
	public void contextInterface() {
		if (state != null) {
			state.algorithmInterface();
		}
	}
}
