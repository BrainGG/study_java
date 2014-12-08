package com.brain.study.patterns.interpreter;

public class Context  {
	private int a;
	private int b;
	public Context(int a , int b) {
		this.a = a;
		this.b = b;
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
}
