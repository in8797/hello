package classes;

public class Car {
	// *필드

	String model;
	String color;
	int price;
	int maxSpeed;

	// *메소드
	void drive() {
		System.out.println("최고속도는 " + maxSpeed);
	}

	void stop() {
		System.out.println("멈춤");
	}

	void accelerate() {

	}

}
