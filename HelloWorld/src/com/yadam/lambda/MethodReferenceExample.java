package com.yadam.lambda;

import java.util.function.IntBinaryOperator;

class Calculator {
	static int staticSum(int x, int y) {
		return x + y;
	}

	int instaticSum(int x, int y) {
		return x + y;
	}
}

public class MethodReferenceExample {
	public static void main(String[] args) {
		int a = 10, b = 20, result = 0;
//		Calculator.staticSum(a, b);

		Calculator cal = new Calculator();
//		cal.instaticSum(a, b);

		IntBinaryOperator oper;
		oper = Calculator::staticSum; // static
		result = oper.applyAsInt(a, b);
		System.out.println("정적메소드참조: " + result);
		
		oper = cal::instaticSum; // instance 메소드
		result = oper.applyAsInt(b, a);
		System.out.println("인스턴스메소드참조: " + result);

	}
}
