package com.yadam.example;

public class Car {
	Tire frontLeft = new Tire("앞왼쪽", 6);
	Tire frontright = new Tire("앞오른쪽", 2);
	Tire backLeft = new Tire("뒤왼쪽", 3);
	Tire backright = new Tire("뒤오른쪽", 4);

	int run() {
		System.out.println("[자동차가 달립니다]");
		if (frontLeft.roll() == false) {
			stop();
			return 1; // 왼쪽 앞바퀴가 문제가 발생하면 1값을 보내겠다.
		} else if (frontright.roll() == false) {
			stop();
			return 2; // 오른쪽 앞바퀴
		} else if (backLeft.roll() == false) {
			stop();
			return 3; // 왼쪽 뒷바퀴
		} else if (backright.roll() == false) {
			stop();
			return 4; // 오른쪽 뒷바퀴
		}
		return 0;
	}

	void stop() {
		System.out.println("[자동차가 멈춥니다]");
	}
}
