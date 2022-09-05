package ch10.lecture.p03execptions;

public class C01RuntimeException {
	public static void main(String[] args) {
		// RuntimeException : 실행 예외
		// unchecked exception 컴파일러 체크를 안해도 된다
		// try-catch 문법 안써도 무방
		
		int a = Integer.parseInt("100");
		int b = Integer.parseInt("이백");	// 문법 오류가 아닌 unchecked exception 문법 사용을 체크하지않음
		
		System.out.println("실행 흐름 이어짐");
	}
}
