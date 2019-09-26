package com.yadam.InterfacePkg;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(12);
		rc.turnOff();

		rc = new Audio();
		rc.turnOn();
		rc.setVolume(12);
		rc.turnOff();

		RemoteControl rc1 = new RemoteControl() {
			int volume;
			@Override
			public void turnOn() {
				System.out.println("익멍구현객체를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("익멍구현객체를 끕니다.");	
			}

			@Override
			public void setVolume(int volume) {
				this.volume=volume;
			}
		};
		rc1.turnOn();
		rc1.turnOff();
	}
}
