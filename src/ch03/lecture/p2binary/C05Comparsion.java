package ch03.lecture.p2binary;

public class C05Comparsion {
	public static void main(String[] args) {
		// 비교연산자
		// <, <=, >, >=, ==, !=
		// 연산결과는 boolean
		// 피연산자는 같은 타입끼리만 가능
		
		int a = 8;
		int b = 5;
		
		boolean c = a < b;
		System.out.println(c);
		System.out.println(a < b);
		
		double d = 8.0;
		System.out.println(a < d);
		System.out.println(b < d);
		
		String e = "8";
//		System.out.println(b < e);	  // 타입이 다르기 때문에 안됨(자바 스크립트에서는 가능)
		System.out.println(b < Integer.valueOf(e));
	}
}
