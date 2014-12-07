package com.brain.study.patterns.proxy;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Proxy proxy  = new Proxy(new RealSubject());
		proxy.request();
	}

}
