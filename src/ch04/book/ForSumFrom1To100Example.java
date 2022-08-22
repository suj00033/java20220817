package ch04.book;

public class ForSumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;						// sum을 0으로 선언
		
		int i = 0;
		for(i=1; i<=100; i++) {
			sum += i;						// sum = sum + i;
		}
		
		System.out.println("1~" + (i-1) + " 합 : " + sum);
	}
}
