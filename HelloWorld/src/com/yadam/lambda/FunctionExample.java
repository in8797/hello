package com.yadam.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

class Student {
	String name;
	int engScore;
	int matScore;

	public Student(String name, int engScore, int matScore) {
		super();
		this.name = name;
		this.engScore = engScore;
		this.matScore = matScore;
	}

	public String getName() {
		return name;
	}

	public int getEngScore() {
		return engScore;
	}

	public int getMatScore() {
		return matScore;
	}

}

public class FunctionExample {
	static List<Student> list = Arrays.asList(new Student("홍길동", 90, 96), new Student("신용권", 95, 93));

	public static void printString(Function<Student, String> func) {
		for (Student student : list) {
			System.out.println(func.apply(student));
		}
	}

	public static void printInt(ToIntFunction<Student> func) {
		for (Student student : list) {
			System.out.println(func.applyAsInt(student));
		}
	}

	public static double avg(ToIntFunction<Student> func) {
		int sum = 0, cnt = 0;
		for (Student student : list) {
			cnt++;
			sum += func.applyAsInt(student);
		}
		return (double) sum / cnt;
	}

	public static void main(String[] args) {
//		Function<Student, String> func = (t) -> {
//			return t.getName();
//		};
		printString((t) -> {
			return t.getName() + "zzzzz";
		});
		ToIntFunction<Student> func = new ToIntFunction<Student>() {

			@Override
			public int applyAsInt(Student value) {
				return value.getEngScore();
			}

		};
		System.out.println("영어점수 : ");
		printInt(func);
		System.out.println("수학점수 : ");
		printInt((s) -> {
			return s.getMatScore();
		});
		System.out.println("영어평균 : ");
		ToIntFunction<Student> func2 = new ToIntFunction<Student>() {

			@Override
			public int applyAsInt(Student value) {
				return value.getEngScore();
			}
		};
		double result = avg(func2);
		System.out.println("result : " + result);

		System.out.println("수학평균 : ");
		result = avg((t) -> {
			return t.getMatScore();
		}); // 수학평균 람다식.
		System.out.println("result: " + result);
	}
}
