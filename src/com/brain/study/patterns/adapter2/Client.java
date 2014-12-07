/**
 * 
 */
package com.brain.study.patterns.adapter2;

/**
 * Client
 * @author Brain
 * @date 2014-12-7
 */
public class Client {

	public static void main(String[] args) {
		Target target = new Adapter(new Adaptee());
		new Client().needTargetInterface(target);
	}
	
	private void needTargetInterface(Target target) {
		target.request();
	}

}
