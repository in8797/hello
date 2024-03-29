package com.yadam.generic.utils;

public class OtherPair<K, V> {
	private K key;
	private V value;

	public OtherPair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

}
