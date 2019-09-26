package hello;

import java.util.Scanner;

public class Baseball {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ran = { (int) (Math.random() * 9) + 1, (int) (Math.random() * 9) + 1, (int) (Math.random() * 9) + 1 };
		boolean run = true;
		for (int i = 0; i < ran.length; i++) {
			
//			 System.out.println(ran[i] + ", " + ran[i] + ", " + ran[i]);
		}
       //중복값  생성되지 않도록 체크
		while (run) {
			System.out.println("첫번째 숫자 : ");
			int a = sc.nextInt();
			System.out.println("두번째 숫자 : ");
			int b = sc.nextInt();
			System.out.println("세번째 숫자 : ");
			int c = sc.nextInt();

			int st = 0, ball = 0;
			int[] num = { a, b, c };
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (ran[i] == num[j]) {
						if (i == j) {
							st++;
						} else
							ball++;
					}
				}
			}
			if (st == 3) {
				run = false;
				System.out.println("게임종료");
			} else {
				System.out.println(st + "strike , " + ball + "ball");
			}
		}
	}
}
