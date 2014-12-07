/**
 * 
 */
package com.brain.study.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;


/**
 * FlyweightFactory
 * 
 * @author Brain
 * @date 2014-12-7
 */
public class FlyweightFactory {
	private Map<String, Flyweight> map = new HashMap<String, Flyweight>();

	public FlyweightFactory() {
	}

	public Flyweight getFlyweight(String key) {
		Flyweight obj = map.get(key);
		if (obj == null) {
			obj = new ConcreteFlyweight();
			map.put(key, obj);
		}
		return obj;
	}
}
