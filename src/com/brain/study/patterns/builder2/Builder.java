/**
 * 
 */
package com.brain.study.patterns.builder2;

/**
 * Builder
 * 
 * @author Brain
 * @date 2014-12-7
 */
public interface Builder {

	public Builder buildPartA();

	public Builder buildPartB();

	public Builder appendPart(Object obj);

	public Product getResult();
}
