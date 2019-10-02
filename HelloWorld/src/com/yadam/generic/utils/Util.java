package com.yadam.generic.utils;

public class Util {

	public static <K, V> V getValue(Pair<K, V> p, K s) {
		if (p.getKey().equals(s)) {
			return p.getValue();
		} else {
			return null;
		}
	}
}