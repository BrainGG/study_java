package com.brain.study.patterns.composite;

public class Leaf implements Component {

	public Leaf() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addComponent(Component component) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void removeCommponent(Component component) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Component getChild(int i) {
		return null;
	}

	@Override
	public void operation() {
		doSomething();
	}

	private void doSomething() {
		// TODO Auto-generated method stub
		
	}

}
