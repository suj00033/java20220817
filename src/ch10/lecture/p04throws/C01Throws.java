package ch10.lecture.p04throws;

public class C01Throws {
	public static void main(String[] args) throws ClassNotFoundException {
		// throws : 이 메소드를 호출한 곳으로 익셉션이 던져질 수 있음
		method1(); 							// 메소드1 호출 > 던져진 익셉션이 이곳으로 넘겨짐 > throws로 던지거나 try로 해결
	}
	
	public static void method1() throws ClassNotFoundException { 				// throws 선언
		Class.forName("java.lang.String");
	}
}
