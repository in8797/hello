package com.yadam.lambda;

import java.util.Comparator;
import java.util.function.BinaryOperator;

class Fruit {
	String name;
	int price;

	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;

	}
}

public class OperatorMinByMaxByExample {
	public static void main(String[] args) {
		BinaryOperator<Fruit> binaryOperator;
		Fruit Fruit;
		Comparator<Fruit> com = new Comparator<Fruit>() {

			@Override
			public int compare(Fruit o1, Fruit o2) {
				int result = 0;
				if (o1.price > o2.price) {
					result = 1;
				} else if (o1.price == o2.price) {
					result = 0;
				} else {
					result = -1;
				}
				return 0;
			}
		};

		binaryOperator = BinaryOperator.maxBy((x,y) -> {
			return Integer.compare(x.price, y.price);
		});
		
//		binaryOperator = BinaryOperator.minBy(com);

		Fruit = binaryOperator.apply(new Fruit("apple", 1000), new Fruit("banana", 2000));
		System.out.println(Fruit.name + ", " + Fruit.price);

	}
}
