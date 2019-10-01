package com.yadam.generic.coures;

public class Course<T> {
	private String name;
	private T[] students;

	public Course(String name, int capacity) { // 제너릭 배열선언할때
		this.name = name;
		students = (T[]) new Object[capacity]; // new T[capacity] 아님 아니라고
	}

	public String getName() {
		return name;
	}

	public T[] getStudents() {
		return students;
	}

	public void add(T t) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}
