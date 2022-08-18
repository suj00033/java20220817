package ch03.book;

public class ArithmeticOperatorExample {
	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1=" + result1);
		
		int result2 = v1 - v2;
		System.out.println("result2=" + result2);
		
		int result3 = v1 * v2;
		System.out.println("result3=" + result3);
		
		int result4 = v1 / v2; 					// int형이라서 소수점이 없음
		System.out.println("result4=" + result4);
		
		int result5 = v1 % v2;					// 5 / 2e
		System.out.println("result5=" + result5);
		
		double result6 = (double) v1 / v2;		// 2.5를 출력하기위해 강제 double 선언, 캐스팅에 ()를 붙여 계산순서를 보여줌
		System.out.println("result6=" + result6);
	}
}
