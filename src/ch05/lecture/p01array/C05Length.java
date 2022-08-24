package ch05.lecture.p01array;

public class C05Length {
	public static void main(String[] args) {
		int[] arr1 = {100, 200, 300};
		
		int[] arr2 = {9, 8};
		
		int[] arr3 = {2};
		
		int[] arr4 = {};
		
		printLength(arr1); // 3출력
		printLength(arr2); // 2출력
		printLength(arr3); // 1출력
		printLength(arr4); // 0출력
		printLength(new int[] {9, 8, 7, 6, 5});		// 5출력
		
	}
	public static void printLength(int[] arr) {
		System.out.println(arr.length);
	}
}
