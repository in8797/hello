package com.yadam.collections.tree;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Fruits {
	String name;
	int price;

	public Fruits(String name, int price) {
		this.name = name;
		this.price = price;
	}
}

class ComparatorClass implements Comparator<Fruits> {

	@Override
	public int compare(Fruits o1, Fruits o2) {
		if (o1.price > o2.price)
			return 1;
		else if (o1.price == o2.price)
			return 0;
		else
			return -1;
	}

}

public class ComparatorExample {
	public static void main(String[] args) {
		TreeSet<Fruits> tSet = new TreeSet<>(new ComparatorClass());
		tSet.add(new Fruits("aaa", 30));
		tSet.add(new Fruits("bbbb", 25));
		tSet.add(new Fruits("cc", 35));
		tSet.add(new Fruits("dddd", 10));

		Iterator<Fruits> iter = tSet.iterator();
		while (iter.hasNext()) {
			Fruits p = iter.next();
			System.out.println(p.name + ", " + p.price);
//			System.out.println(iter.next().name + ", " + iter.next().age);
		}
	}
}
