package com.yadam.lambda;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	static int[] scores = { 92, 95, 87 };

	static int minOrMax(IntBinaryOperator oper) {
		int result = scores[0]; // 초기값 중요
		for (int score : scores) {
			result = oper.applyAsInt(result, score);
		}
		return result;
	}

	public static void main(String[] args) {
		IntBinaryOperator oper = (left, right) -> {
			int result = 0;
//			result = (left >= right ? left : right);
			return (left >= right ? left : right);

		};
		int result = minOrMax(oper);
		System.out.println("max: " + result);

//		for (int i = 0; i < 5; i++) { 가능함
//			int num = 0;
//		}
//
//		for (int i = 0; i < 5; i++) {
//			int num = 0;
//		}

		result = minOrMax((left, right) -> {
			return (left <= right ? left : right);
		});
		System.out.println("min: " + result);
	}
}
