package com.yadam;

public class CellPhone {
	String model;
	String color;

	public CellPhone() {
		super();

	}

	public CellPhone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	void powerOn() {
		System.out.println("전원 ON");
	}

	void poweroff() {
		System.out.println("전원 OFF");
	}

	void bell() {
		System.out.println("벨을 울립니다");
	}

	void hangup() {
		System.out.println("전화를 끊습니다");
	}
}
