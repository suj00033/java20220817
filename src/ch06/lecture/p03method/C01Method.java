package ch06.lecture.p03method;

public class C01Method {
	public static void main(String[] args) {
		MyClass1 o1 = new MyClass1();
		
		o1.name = "Jack";
		o1.age = 16;				   // 인스턴스 필드
		
		o1.method();                  // 나중에 실행되는 코드, 인스턴스(메소드 호출)가 있어야 메소드 실행
		
		System.out.println("메인 메소드 코드1");
	}
}
