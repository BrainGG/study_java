/**
 * 
 */
package com.brain.study.patterns.iterator;

/**
 * Iterator
 * 
 * @author Brain
 * @date 2014-12-8
 */
public interface Iterator<T> {
	T next();

	boolean hasNext();
}
