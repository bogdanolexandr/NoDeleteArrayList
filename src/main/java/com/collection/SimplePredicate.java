package com.collection;

import java.util.function.Predicate;

public class SimplePredicate<T> implements Predicate<T> {

	private T data;

	public SimplePredicate(T data) {
		this.data = data;
	}

	@Override
	public boolean test(T t) {
		if (t.equals(data)) {
			return true;
		}
		return false;
	}

}
