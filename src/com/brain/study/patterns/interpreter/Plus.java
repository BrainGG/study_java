package com.brain.study.patterns.interpreter;

public class Plus implements Interpreter {

	@Override
	public int interpret(Context context) {
		return context.getA() + context.getB();
	}

}
