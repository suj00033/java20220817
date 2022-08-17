package ch02.lecture;

public class C02Scope {
	public static void main(String[] args) {
		// 변수는 선언된 블럭{} 내에서만 사용 가능
		int a = 3;
		
		if (true) {
			// int a = 5; 재선언 안됨
			int b = 4;
			System.out.println(a); // a는 여전히 {}안에 있기 때문에 가능
			System.out.println(b);
		}
		// System.out.println(b); 얘는 안됨
	}
}
