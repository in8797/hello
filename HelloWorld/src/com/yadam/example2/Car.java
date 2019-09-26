package com.yadam.example2;

import com.yadam.example.Tire;

public class Car {
	Tire[] t1 = { new Tire("앞왼쪽", 6), new Tire("앞오른쪽", 2), new Tire("뒤왼쪽", 3), new Tire("뒤오른쪽", 4) };

	int run() {
		System.out.println("[자동차가 달립니다]");
		for (int i = 0; i < t1.length; i++) {
			if (t1[i].roll() == false) {
				stop();
				return i + 1;
			}
		}
		return 0;
	}

//	int run() {
//		System.out.println("[자동차가 달립니다]");
//		if (t1[0].roll() == false) {
//			stop();
//			return 1; // 왼쪽 앞바퀴가 문제가 발생하면 1값을 보내겠다.
//		} else if (t1[1].roll() == false) {
//			stop();
//			return 2; // 오른쪽 앞바퀴
//		} else if (t1[2].roll() == false) {
//			stop();
//			return 3; // 왼쪽 뒷바퀴
//		} else if (t1[3].roll() == false) {
//			stop();
//			return 4; // 오른쪽 뒷바퀴
//		}
//		return 0;
//	}

	void stop() {
		System.out.println("[자동차가 멈춥니다]");

	}
}
