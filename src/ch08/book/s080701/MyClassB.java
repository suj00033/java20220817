package ch08.book.s080701;

public class MyClassB implements MyInterface {
	@Override
	public void method1() {
		System.out.println("MyClassB-method1() 실행");
	}
	
	public void method2() {											// 디폴트
		System.out.println("MyClassB-method2() 실행");			  	// 메소드 재정의
	}
}
