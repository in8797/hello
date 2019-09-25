package com.yadam;

class Calculator {
	double areaCircle(double r) {
		return 3.14 * r * r;
	}
}

class Computer extends Calculator {
	@Override // 부모클래스가 가지고 있는 메소드를 재정의 하겠다는 의미
	double areaCircle(double r) {
		return Math.PI * r * r;

	}
}

public class ComputerExample {
	public static void main(String[] args) {
		Computer com = new Computer();
		System.out.println("결과값: " + com.areaCircle(10));
	}
}
