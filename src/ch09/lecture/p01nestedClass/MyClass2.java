package ch09.lecture.p01nestedClass;

public class MyClass2 {
	public static void main(String[] args) {
		class LocalClass implements MyInterface2 {
			@Override
			public void method() {
				System.out.println("재정의한 메소드");
			}
		}
		
//		LocalClass l = new LocalClass();	// LocalClass가 MyInterface로 가능
		MyInterface2 l = new LocalClass();
		l.method();							// 로 호출
	}
}

interface MyInterface2 {
	void method();				// 추상 메소드 > 재정의 필수
}