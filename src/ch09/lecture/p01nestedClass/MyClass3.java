package ch09.lecture.p01nestedClass;

public class MyClass3 {
	public static void main(String[] args) {
		MyInterface3 l = new MyInterface3() {			// 4. 변수 초기화
			@Override									// 3. 재정의
			public void method() {
				System.out.println("재정의한 메소드!!");	
				
			}
		};
		
		l.method();										// 호출
		
	}
}

interface MyInterface3 {						// 1. 인터페이스
	void method();								// 2. 추상 메소드
}
