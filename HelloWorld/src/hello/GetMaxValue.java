package hello;

import java.util.Scanner;

public class GetMaxValue {
	public static void main(String[] args) {
		int[] aAry = new int[5];
		int re = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < aAry.length; i++) {
			System.out.println("입력하십쇼");
			aAry[i] = sc.nextInt();
		}
		for (int i = 0; i < aAry.length; i++) {
			if (re < aAry[i])
				re = aAry[i];
			// re=(re>aAry[i] ? re : aAry[i]);
		}
		System.out.println(re);

	}

}
