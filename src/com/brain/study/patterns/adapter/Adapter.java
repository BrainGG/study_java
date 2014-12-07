/**
 * 
 */
package com.brain.study.patterns.adapter;

/**
 * Adapter
 * @author Brain
 * @date 2014-12-7
 */
public class Adapter extends Adaptee implements ITarget {

	/**
	 * 
	 */
	public Adapter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void request() {
		specificRequest();
	}
}
