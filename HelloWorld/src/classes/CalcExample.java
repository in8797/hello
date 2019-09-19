package classes;

import java.util.Scanner;

public class CalcExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 값");
		int a= sc.nextInt();
		System.out.println("첫번째 값");
		int b= sc.nextInt();
		Calculator cal = new Calculator();
		cal.execute(a,b);
		
		
	}
}
