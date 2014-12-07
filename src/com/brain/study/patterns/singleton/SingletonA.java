/**
 * 
 */
package com.brain.study.patterns.singleton;

/**
 * SingletonA
 * 
 * @author Brain
 * @date 2014-12-7
 */
public class SingletonA {
	private static final SingletonA instance = new SingletonA();

	private SingletonA() {
	}

	public static SingletonA getInstacne() {
		return instance;
	}
}
