package java20220817.ex.ch06.s061004;

public class Car {
	int speed;
	
	void run() {
		System.out.println(speed +  "으로 달립니다.");
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();					// 정적 메소드를 사용하기 위해 객체를 먼저 생성하고
		myCar.speed = 60;						// 참조 변수로 접근
		myCar.run();
	}
}
