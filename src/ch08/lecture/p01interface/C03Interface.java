package ch08.lecture.p01interface;

public class C03Interface {
	public static void main(String[] args) {
		MyInterface3 o1 = new MyClass3();
		MyInterface3 o2 = new MyClass4();
		
		o1.method1();      // 재정의한 문구가 출력
		o2.method1();
		
		
		
		System.out.println("=========메소드 호출");
		method1(o1);
	}
	
	public static void method1(MyInterface3 o) {		// 14번째 호출
		o.method1();
		o.method2();
		o.method3();
		o.method4();
	}
}
