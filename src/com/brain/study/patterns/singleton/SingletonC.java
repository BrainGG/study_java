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
public class SingletonC {
	private static volatile SingletonC instance = null;

	private SingletonC() {
	}

	public static SingletonC getInstacne() {
		if (instance == null) {
			synchronized (instance) {
				if (instance == null) {
					instance = new SingletonC();
				}
			}
		}

		return instance;
	}
}
