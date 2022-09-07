package ch11.lecture.p02wrapper;

import java.util.Arrays;

public class C01Wrapper {
	public static void main(String[] args) {
		// data type : primitive type(ch2), reference(ch5)
		
		// 기본타입 8개   >>>>   참조타입 8개 (p527)
		// int, byte, short, long, char, float, double, boolean
		// Integer, Byte, Short, Long, Character, Float, Double, Boolean
		
		String[] arr1 = new String[3];
		arr1[0] = "coyote";
		arr1[1] = "goose";
		arr1[2] = "dog";
		
		int[] arr2 = new int[3];
		arr2[0] = 99;
		arr2[1] = 100;
		arr2[2] = 300;
		
		int a = 3;									// 원래는 참조타입이 아니기 때문에 identityHashCode가 안나옴
		Integer b = Integer.valueOf(3);				// 참조타입
		
//		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		
		Object[] arr3 = new Object[3];
		arr3[0] = "horse";
		arr3[1] = Integer.valueOf(99);								// 문자열에서 정수형으로 
		arr3[2] = Integer.valueOf(100);
		
		System.out.println(Arrays.toString(arr3));
	}
}
