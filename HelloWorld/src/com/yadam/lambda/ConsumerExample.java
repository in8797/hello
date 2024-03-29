package com.yadam.lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
	public static void main(String[] args) {
		Consumer<String> consumer = (t) -> {
			System.out.println(t + "8");
		};
		consumer.accept("java");

		BiConsumer<String, String> bigConsumer = (t, u) -> {
			System.out.println(t + u);
		};
		bigConsumer.accept("java", "8");

		DoubleConsumer doubleConsumer = d -> System.out.println("java" + d);

		doubleConsumer.accept(8.0);

		ObjIntConsumer<String> objConsumer = (s, i) -> {
			System.out.println(s + i);
		};
		objConsumer.accept("java", 8);
	}
}
