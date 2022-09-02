package ch09.lecture.p02lambda;

import java.util.Arrays;

public class MyClass8 {
	public static void main(String[] args) {
		// setAll(int[] array, IntUnaryOperator) > 추상메소드 int
		int[] a1 = new int[10];
		System.out.println(Arrays.toString(a1));
		
		Arrays.setAll(a1, i -> i); 						
		System.out.println(Arrays.toString(a1));

		Arrays.setAll(a1, i -> i + 1); 						
		System.out.println(Arrays.toString(a1));

		Arrays.setAll(a1, i -> i * 2); 						
		System.out.println(Arrays.toString(a1));
		
		
	}
}
