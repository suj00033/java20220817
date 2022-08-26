package ch06.lecture.p03method;

public class MyClass4 {
	// 필드
	
	
	// 생성자
	
	
	// 메소드리턴 타입 : 메소드 내에서 반환하는 값의 타입
	// 단, void는 리턴값이 없음
	void method1() {       
		
		
		return;
		// return : 메소드 종료, 값 반환
	}
	
	int method2() {
		
		return 3;                        // void값과 일치해야함
	}
	
	double method3() {
		
		return 8.0;
	}
	
	int method4() {
		int a = 3;
		if (a == 3) {
			return 10;
		}
		
		return 3;					// 리턴값 입력안하면 문법오류뜸
	}
}
