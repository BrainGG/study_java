/**
 * 
 */
package com.brain.study.patterns.builder2;

/**
 * Director
 * @author Brain
 * @date 2014-12-7
 */
public class Director {

	private Builder builder = null;

	public Director(Builder builder) {
		this.builder   = builder;
	}

	public void construct() {
		builder.buildPartA().buildPartB().appendPart(new Object());
	}
}
