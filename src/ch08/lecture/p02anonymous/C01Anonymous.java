package ch08.lecture.p02anonymous;

public class C01Anonymous {
	public static void main(String[] args) {
//		MyInterface1 o1 = new MyInterface1();						// 그냥 쓰면 x
//		MyInterface1 o2 = new MyClass1();
		
		// 인터페이스 구현과 객체 생성을 한번에 						// 5, 6, 15~17째 줄을 한번에 구현시킨것
		MyInterface1 o3 = new MyInterface1() {							// o3이라는 변수가 가르키고 있는 
			@Override													
			public void method() {
				System.out.println("재정의한 메소드!!!");
			}
		};
		
		o3.method();													// o3이라는 변수가 가르키고 있는 
		
	}
}

//class MyClass1 implements MyInterface1 {
//	
//}

interface MyInterface1 {
	void method();										// 추상 메소드를 사용하기 위해서 클래스에서 재정의 필수
}
