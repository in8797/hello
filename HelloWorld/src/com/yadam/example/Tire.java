package com.yadam.example;

public class Tire {
	int maxRotation;// 사용가능한 최대 회전수. (총 몇바퀴돌아야 다쓰는지 )
	int accumulatedRotation;// 사용으로 인해 축적된 회전수.
	String location;

	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	public boolean roll() {
		accumulatedRotation++;
		if (maxRotation > accumulatedRotation) {
			System.out.println(location + " 타이어 수명: " + (maxRotation - accumulatedRotation) + " 회");
			return true;
		} else {
			System.out.println("***" + location + "타이어 펑크 ***");
			return false;
		}
	}
}
