package com.collection;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list = new NoDeleteArrayList<>();
		list.add("hello");
		list.add("world");

		System.out.println(list);

		try {
			list.remove("hello");
		} catch (UnsupportedOperationException e) {
			System.out.println("you can't delete from this list");
		}

		System.out.println(list);
	}

}
