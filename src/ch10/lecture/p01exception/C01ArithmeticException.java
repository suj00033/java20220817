package ch10.lecture.p01exception;

public class C01ArithmeticException {
	public static void main(String[] args) {
		int a = 3;
		int b = 0;
		
		if( b != 0) {							// 오류발생을 없애기 위해 if구문을 삽입
		int c = a / b; 							// 오류
		
		System.out.println(c);
		}
		System.out.println("프로그램 종료");
		
		
	}
}
