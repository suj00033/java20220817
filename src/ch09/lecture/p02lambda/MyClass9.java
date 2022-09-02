package ch09.lecture.p02lambda;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;

public class MyClass9 {
	public static void main(String[] args) {
		int[] a1 = new int[10];
		// setAll() 배열을 채우는데 사용할 함수형 인터페이스를 매개변수로 받는다
		// 함수형 객체나 람다식을 매개변수로 지정해야함
		setAll(a1, i -> i);
		System.out.println(Arrays.toString(a1));

		setAll(a1, i -> i + 1);
		System.out.println(Arrays.toString(a1));  	// toString : 일차원 배열만 출력

		setAll(a1, i -> i * 2);
		System.out.println(Arrays.toString(a1));

		// a1 : [10, 9, 8 ..., 1]
		setAll(a1, i -> a1.length-i);
		System.out.println(Arrays.toString(a1));

		// a1 : [9, 8, 7 ..., 0]
		setAll(a1, i -> a1.length-i-1);
		System.out.println(Arrays.toString(a1));
	}

	public static void setAll(int[] arr, IntUnaryOperator gen) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = gen.applyAsInt(i);

			/*
			 * Arrays.setAll(a1, i -> i); System.out.println(Arrays.toString(a1)); 으로 압축
			 */

		}
	}
}