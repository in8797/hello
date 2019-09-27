package hello;

import java.util.Scanner;

public class TestScore {
	static Scanner sc = new Scanner(System.in);
	static TestStudent[] testAry = new TestStudent[10];

	public static void main(String[] args) {
		boolean run = true;

		while (run) {			//메뉴입력
			System.out.println("1.학생성적등록 2.전체리스트 3.학생번호조회 4.전체통계 5.총점기준정렬 6.종료");
			int menu = sc.nextInt();

			if (menu == 1) {
				creat();
			} else if (menu == 2) {
				allList();
			} else if (menu == 3) {
				List();
			} else if (menu == 4) {
				Num();
			} else if (menu == 5) {

			} else {
				System.out.println("종료.");
				run = false;
			}

		}
	}
	
	public static void creat() {//학생성적입력
		System.out.println("학생번호 : ");
		int snum = sc.nextInt();
		sc.nextLine();
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("국어 : ");
		int ko = sc.nextInt();
		System.out.println("영어 : ");
		int en = sc.nextInt();
		System.out.println("수학 : ");
		int ma = sc.nextInt();

		TestStudent t = new TestStudent(snum, name, ko, en, ma);
		for (int i = 0; i < testAry.length; i++) {
			if (testAry[i] == null) {
				testAry[i] = t;
				break;
			}
		}
	}

	public static void allList() {//전체리스트
		for (int i = 0; i < testAry.length; i++) {
			if (testAry[i] != null)
				System.out.println(testAry[i].getSnum() + "/ " + testAry[i].getName() + "/ " + testAry[i].getKo() + "/ "
						+ testAry[i].getEn() + "/ " + testAry[i].getMa());
		}
	}

	public static void List() {//학생번호조회
		System.out.println("학생번호를 입력 : ");
		int num1 = sc.nextInt();

		for (int i = 0; i < testAry.length; i++) {
			if (testAry[i] != null && testAry[i].getSnum() == num1) {
				System.out.println(testAry[i].getSnum() + "/ " + testAry[i].getName() + "/ " + testAry[i].getKo() + "/ "
						+ testAry[i].getEn() + "/ " + testAry[i].getMa() + "/ " + testAry[i].getSum() + "/ "
						+ testAry[i].getAvg());

			}
		}
	}

	public static void Num() {//전체통계

	}

}
