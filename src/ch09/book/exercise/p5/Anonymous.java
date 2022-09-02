package ch09.book.exercise.p5;

public class Anonymous {
	// 필드 초기값 대입
	Vehicle field = new Vehicle() {								// 필드 선언과
		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
			}
	};															// 초기값 대입
	
	void method1() {
		// 로컬 변수값으로 대입									// 로컬 변수 선언과
		Vehicle localVar = new Vehicle() {
			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
				}
		};														// 초기값 대입
		
		// 로컬 변수 사용
		localVar.run();
	}
	
	void method2(Vehicle v) {
		v.run();												// 메소드를 호출할때
	}
}
// 로컬 변수를 안쓴다면
// class VehicleImpl implements Vehicle
// @Override 를 모두 써야함.