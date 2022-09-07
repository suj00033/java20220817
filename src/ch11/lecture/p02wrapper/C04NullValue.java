package ch11.lecture.p02wrapper;

public class C04NullValue {
	public static void main(String[] args) {
		int a = 3;
		Integer b = 3;						// Null이라는 값을 가질수 있음
		
//		int d = null;						//(x)
		Integer c = null;
		
		int e = c;							// runtime exception	오류가 나니 주의해서 써야함
		
		System.out.println("프로그램 실행 이어감");
		
	}
}
