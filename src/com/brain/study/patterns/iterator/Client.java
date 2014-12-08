package com.brain.study.patterns.iterator;

public class Client {
	public static void main(String[] args) {
		ConcreteAggregate<String> objs = new ConcreteAggregate<String>();
		for (int i = 0; i < 20; i++) {
			objs.add(String.valueOf(i));
		}
		objs.remove("9");
		Iterator<String> iterator = objs.iterator();
		for (;iterator.hasNext(); ) {
			System.out.println(iterator.next());
		}
	}
}
