/**
 * 
 */
package com.brain.study.patterns.flyweight;

/**
 * Client
 * @author Brain
 * @date 2014-12-7
 */
public class Client {
	public static void main(String[] args) {
		FlyweightFactory flyweight  = new FlyweightFactory();
		flyweight.getFlyweight("a");
		flyweight.getFlyweight("b");
		flyweight.getFlyweight("c");
	}

}
