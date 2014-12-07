/**
 * 
 */
package com.brain.study.patterns.adapter;

/**
 * Client
 * @author Brain
 * @date 2014-12-7
 */
public class Client {

	public static void main(String[] args) {
		new Client().needTargetInterface(new Adapter());
	}
	
	private void needTargetInterface(ITarget target) {
		target.request();
	}

}
