package com.yadam;

public class DmbCellPhone extends CellPhone {
	int channel;

	public DmbCellPhone(int channel) {
		super(); //부모가 가지고 있는 메소드를 말함
		this.channel = channel;
	}

	public DmbCellPhone() {
		super();

	}

	public DmbCellPhone(String model, String color,int channel) {
		super(model, color);
		this.channel = channel;

	}
	void tureOnDMb() {
		System.out.println("채널 " + channel + "번 방송수신을 시작합니다");
	}
	void changechannel(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 변경합니다");
	}
	
	void turnOffDmb() {
		System.out.println("");
	}
	
}
