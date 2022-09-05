package ch10.lecture.p05throw;

import javax.management.RuntimeErrorException;

public class C01Throw {
	public static void main(String[] args) {
		try {
		method1();
	} catch (RuntimeErrorException e) {
		System.out.println("실행");
	}
	}
	private static void method1() {					// RunTimeException이기에 
		System.out.println("코드1");				// throws를 명시해도 되고 안해도 된다
		System.out.println("코드2");
		
		// 예외 발생
		// throw Exception
		throw new RuntimeException();	
	}
}













// 참조값이 있다는 것은 인스턴스가 생성되었다는 뜻