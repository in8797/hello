package com.yadam.generic;

public class Util {
	public static <T> Box<T> boxing(T t) { // 제너릭타입
		Box<T> box = new Box<T>();
		box.setObj(t);
		return box;
	}

	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean bool1 = p1.getKey().equals(p2.getKey());
		boolean bool2 = p1.getValue().equals(p2.getValue());

		return bool1 && bool2;
	}

	public static <K, V> boolean compareValue(Pair<K, V> p3, Pair<K, V> p4) {
		boolean bool3 = p3.getValue().equals(p4.getValue());

		return bool3;
	}

	
	public static <T extends Number> int compare(T t1, T t2) { //★★
		double d1= t1.doubleValue();
		double d2= t2.doubleValue();
		return Double.compare(d1, d2);
	}
	
//	public static Box boxing2(int a) { 기존에쓰던타입
//		return null;
//	}
}
