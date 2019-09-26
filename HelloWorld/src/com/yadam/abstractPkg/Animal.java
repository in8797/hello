package com.yadam.abstractPkg;

public abstract class Animal {
	public String kind;

	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}

	public abstract void sound(); // 정의 된적이 없는 메소드를 추상클래스라 부름.
}

class Cat extends Animal {

	@Override
	public void sound() {
		System.out.println("야옹");
	}
}

class Dog extends Animal {
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}