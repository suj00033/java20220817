package ch08.lecture.p03others;

public interface MyInterface1 {
	void method();					// public abstract
	
	// public이 생략되어있음
	default void method2() {
		// interface default method
		// 재정의하지 않아도 되는 인스턴스 메소드
	}
}
