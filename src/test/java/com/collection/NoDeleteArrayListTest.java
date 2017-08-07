package com.collection;


import java.util.Arrays;
import java.util.function.Predicate;
import org.junit.Before;
import org.junit.Test;

import com.collection.NoDeleteArrayList;
import com.collection.SimplePredicate;

public class NoDeleteArrayListTest {

	private NoDeleteArrayList<String> list = new NoDeleteArrayList<>();

	@Before
	public void setUp() throws Exception {
		list.add("hello");
		list.add("world");
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testRemoveByIndex() {
		list.remove(1);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testRemoveByObject() {
		list.remove("hello");
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testRemoveAll() {
		String[] array = { "hello", "world" };
		list.removeAll(Arrays.asList(array));
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testRemoveIf() {
		Predicate<String> predicate = new SimplePredicate<String>("hello");
		list.removeIf(predicate);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testRemoveRange() {
		list.removeRange(1, 2);
	}

}
