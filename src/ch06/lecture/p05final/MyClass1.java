package ch06.lecture.p05final;

public class MyClass1 {
	// static final : 상수 (변하지않는 값)
	// 상수명 작성 관습 : UPPER_SNAKE_CASE
	static final int ABC = 9999;
	static final int MY_HOME_NUMBER = 333;
	static final int DEF;
	
	static {
		DEF = 10000;
	}
	
	final int a = 5;
	final int b;      // final이 필드에 붙으면 한번은 꼭 초기화시켜줘야한다
	
	public MyClass1() {
		b = 9;
	}
	
	MyClass1(int b) {
		this.b = b;
	}
	
	MyClass1(int c, int d) {
		this.b = 999;
	}
	
	
	
}
