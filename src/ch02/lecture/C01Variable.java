package ch02.lecture;

public class C01Variable {
	public static void main(String[] args) {
		// 변수 : 값을 저장하는 공간의 이름
		// 타입명 변수명;
		int a; // a라는 int타입 변수 선언
		a = 3; // a변수에 3 대입(할당)
		
		int b = 3; // b라는 int타입 변수 선언 및 값 할당
		
		// 변수명 작성 규칙
		// 사용할 수 있는 문자 : 영문대소문자, 숫자, $, _
		// 숫자로 시작하면 안됨
		// 키워드 사용하면 안됨
		// 같은 이름의 변수명 재선언 안됨
		// int b;
		
		int c;
		int $;
//		int _; // 안됨
		int _a; // 얘는 됨
		int A;
		int C;
//		int 3; // 안됨
		int a3; // 얘는 됨
		
		// 변수명 작성 관습 : lowerCamelCase
		int studentNumber;
		int yourCar;
		int MyCar; // 얘는 안됨
		int our_home; // 얘도 안됨
		
	}
}
