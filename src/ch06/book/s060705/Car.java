package ch06.book.s060705;

public class Car {
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자 : 필드를 초기화하는 역할
	Car() {
	}

	Car(String model) {
		this(model, "은색", 250); // 필요한 초기값을 this로 축약
	}

	Car(String model, String color) {
		this(model, color, 250);
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
}
