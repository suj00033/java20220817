package ch09.lecture.p01nestedClass;

public class MyClass4 {
	public static void main(String[] args) {
		// lambda expression : 로컬 클래스 
		MyInterface4 l = () -> {							// 꺾쇠로 파라미터 안에 있는걸 불러올수 있음
			System.out.println("재정의한 메소드");
		};
		
		
	}
}


interface MyInterface4 {
	void method();						// 구현해내야할 추상 메소드가 하나면 람다식 표현
										// (클래스 구현, 메소드 시그니처)으로 모두 생략가능
	default void method3() {
		
	}
	
}