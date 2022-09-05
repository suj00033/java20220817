package ch10.lecture.p02try;

public class C01Try {
	public static void main(String[] args) {
		int a = 3;
		int b = 0;
		
		try {
			// try : Exception이 발생할 수 있는 코드 블럭		// 오류가 없을 경우에는 try블럭을 지나감
			
			int c = a / b;										// throw한 것을 
			
			System.out.println(c);
			
		} catch (ArithmeticException e) {						// catch로 붙잡아 오류 검사
			// 발생한 exception 객체 잡고 종료하지않고 실행하는 코드 블럭
			System.out.println("EXCEPTION 발생하면 실행되는 코드 블럭");
			
		}
		
		System.out.println("프로그램 이어가기");
	}
}
