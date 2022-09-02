package ch09.book.exercise.p5;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		// 익명 객체 사용
		anony.field.run();
		// 익명 객체 로컬 변수 사용
		anony.method1();
		// 익명 객체 매개값 사용
		anony.method2(new Vehicle() {							// 매				// 본래라면 Anonymous에서 호출식을 넣었다.
			public void run() {									// 개
				System.out.println("트럭이 달립니다.");			// 값
			}
		}
		);
	}
}
