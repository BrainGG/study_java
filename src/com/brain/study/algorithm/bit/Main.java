package com.brain.study.algorithm.bit;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(abs(getOppositeNumber(10)));
		System.out.println(getOppositeNumber(-10));
	}

	static int abs(int x) {
		int y;
		y = x >> 31;
		return (x ^ y) - y; // or: (x+y)^y
	}

	static int getOppositeNumber(int a) {
		return ~a + 1;
	}

}
