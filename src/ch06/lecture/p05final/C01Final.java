package ch06.lecture.p05final;

public class C01Final {
	public static void main(String[] args) {
		// 책 p645
		// final : 변수에 값을 한번만 할당할 수 있다
		// final 필드에서 초기값을 줄수 있을때는
		// 1. 필드 선언시에 2. 생성자에서 주는 방법이 있다
		
		int a = 3;
		a = 5;
		
		final int b;									// 지역변수
		b = 9;
//		b = 10;     // 두번 값입력 xxxx
		
		method1(30);
		method2(33);
		method2(44);
	}
	
	static void method1(int i) {
		i = 3;     // 두번 할당 가능oooooooo
	}

	static void method2(final int i) {
//		i = 5;     // final일때는 두번 할당xxxxxx
	}
}
