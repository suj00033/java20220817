package ch03.book;

public class InfinityAndNaNCheckExample {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;							// 실수 0으로 나눔
		
//		double z = x / y;
		double z = x % y;
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
		
		System.out.println(z + 2); 						//문제가 되는 코드
	}
}
