package com.brain.study.patterns.iterator;

import java.util.NoSuchElementException;

public class ConcreteAggregate<T> implements Iterable<T> {

	private int MAX_SIZE = 12;
	private Object[] data = new Object[MAX_SIZE];
	private int size = 0;

	public void add(T t) {
		if (size < MAX_SIZE) {
			data[size++] = t;
		}
	}

	public void remove(T t) {
		for (int i = 0; i < size; i++) {
			if (data[i].equals(t)) {
				for (int j = i; j < size && j < MAX_SIZE - 1; j++) {
					data[j] = data[j + 1];
				}
				size--;
			}
		}
	}

	public int size() {
		return size;
	}

	@Override
	public Iterator<T> iterator() {
		return new ConcreteIterator<T>();
	}

	private class ConcreteIterator<E> implements Iterator<E> {
		private int index = 0;

		@SuppressWarnings("unchecked")
		@Override
		public E next() {
			if (index >= size) {
				throw new NoSuchElementException();
			}
			return (E) data[index++];
		}

		@Override
		public boolean hasNext() {
			return index != size;
		}

	}
}
