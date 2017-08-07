package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class NoDeleteArrayList<E> extends ArrayList<E> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4463859910732985210L;

	@Override
	public E remove(int arg0) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean remove(Object arg0) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean removeIf(Predicate<? super E> arg0) {
		throw new UnsupportedOperationException();
	}

	@Override
	protected void removeRange(int arg0, int arg1) {
		throw new UnsupportedOperationException();
	}

}
