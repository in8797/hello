package hello;

import java.util.Scanner;

public class Exercise010 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3. 점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택>");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) { // 학생수만큼 배열생성
				System.out.print("학생수>");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				
			} else if (selectNo == 2) { // 생성된 배열 점수입력.
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]> ");
					scores[i] = scanner.nextInt();
				}
			} else if (selectNo == 3) { // 배열입력된 전체조회.
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]> " + scores[i]);
					scores[i] = scanner.nextInt();
				}
			} else if (selectNo == 4) { // 큰값, 평균.
				int sum = 0;
				int max = 0;
				double avg = 0.0;
				for (int i = 0; i < scores.length; i++) {
					sum = sum + scores[i];
					max = (max < scores[i] ? scores[i] : max);

				}
				avg = (double) sum / scores.length;
				System.out.println("최고점 : " + sum);
				System.out.print("평균 : " + avg);
			} else if (selectNo == 5) { // 종료. (break;)
				run = false;
			}

		}

		System.out.println("프로그램 종료");

	}
}
