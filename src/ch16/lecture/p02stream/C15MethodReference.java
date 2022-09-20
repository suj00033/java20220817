package ch16.lecture.p02stream;

import java.util.Arrays;

public class C15MethodReference {
	public static void main(String[] args) {
		String[] arr1 = { "iron", "cap", "widow", "hulk", "panthe" };
		
		System.out.println(Arrays.toString(arr1));
//		Arrays.sort(arr1, (a, b) -> a.compareTo(b));				// 작은 순서대로 정렬
		Arrays.sort(arr1, String::compareTo);						// method reference		
		System.out.println(Arrays.toString(arr1));		
		
		Arrays.sort(arr1, (a, b) -> b.compareTo(a)); 				// a b순서를 거꾸로 쓰고싶을땐 ::  사용x	
		System.out.println(Arrays.toString(arr1));
	}
}
