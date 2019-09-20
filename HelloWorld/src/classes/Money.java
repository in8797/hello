package classes;

import java.util.Scanner;

public class Money {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요.");
		int mon = sc.nextInt();
		show(mon);
	}

	static void show(int a) {

		int mon = a;
		int mok = 0, n = 0;
		int[] per = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		for (int i = 0; i < per.length; i++) {
			mok = mon / per[i];
			n = mon % per[i];
			System.out.println(per[i] + "원짜리" + mok);
			mon = n;
		}

	}

}
