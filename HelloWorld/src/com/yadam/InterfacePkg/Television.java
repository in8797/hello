package com.yadam.InterfacePkg;

public class Television implements RemoteControl{
	int volume;
	@Override
	public void turnOn() {
		System.out.println("텔레비전을 겹니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("텔레비젼을 끕니다.");
	}

	@Override
	public void setVolume(int volume) {		
	this.volume=volume;
	}

}
