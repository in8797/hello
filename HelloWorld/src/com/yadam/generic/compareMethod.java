package com.yadam.generic;

public class compareMethod {
	public static void main(String[] args) { // 제너릭 선언하는
		Pair<String, Integer> p1 = new Pair<>("apple", 10);
		Pair<String, Integer> p2 = new Pair<>("apple", 10);
		boolean result = Util.compare(p1, p2);
		if (result)
			System.out.println("두 객체가 논리적으로 동일함.");
		else
			System.out.println("두 객체가 논리적으로 동일하지 않음.");

//		("user1","orange");
//		("user2","orange");
		Pair<String, String> u1 = new Pair<>("user1", "orange");
		Pair<String, String> u2 = new Pair<>("user2", "orange");
		boolean st = Util.compare(u1, u2);
		if (st)
			System.out.println("두 객체가 논리적으로 동일함.");
		else
			System.out.println("두 객체가 논리적으로 동일하지 않음.");

		System.out.println("==========================================");

//		Util.compareValue();
//		Pair("orange",10);
//		pair("apple",10);

//		Pair("orange","good");
//		pair("apple","good");

		Pair<String, Integer> p3 = new Pair<>("orange", 10);
		Pair<String, Integer> p4 = new Pair<>("apple", 10);
		result = Util.compareValue(p3, p4);
		if (result)
			System.out.println("두 객체가 논리적으로 동일함.");
		else
			System.out.println("두 객체가 논리적으로 동일하지 않음.");

		Pair<String, String> u3 = new Pair<>("orange", "good");
		Pair<String, String> u4 = new Pair<>("apple", "good");
		result = Util.compareValue(u3, u4);
		if (result)
			System.out.println("두 객체가 논리적으로 동일함.");
		else
			System.out.println("두 객체가 논리적으로 동일하지 않음.");

		Integer intV1 = Util.compare(12.3, 2.3);
		System.out.println(intV1);
	}
}
