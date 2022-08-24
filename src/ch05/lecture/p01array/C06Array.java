package ch05.lecture.p01array;

public class C06Array {
	public static void main(String[] args) {
		int[] arr1 = {9, 8};
		int[] arr2 = {100, 50};
		int[] arr3 = {99, 100, 101};
		
		printFirstItem(arr1);		// 9
		printFirstItem(arr2);		// 100
		printFirstItem(arr3);		// 99
		printFirstItem(new int[] {10000});	// 10000
		
		printLastItem(arr1);		// 8
		printLastItem(arr2);		// 50
		printLastItem(arr3);		// 101
		printLastItem(new int[] {-1});	// -1
		
		printMiddleItem(arr1);								// 8
		printMiddleItem(arr2);								// 50
		printMiddleItem(arr3);								// 100
		printMiddleItem(new int[] {5, 6, 7, 8, 9});			// 7
		printMiddleItem(new int[] {100, 200, 300, 400});	// 300
	}
	public static void printFirstItem(int[] fi) {
		System.out.println(fi[0]);
	}
	public static void printLastItem(int[] la) {
		System.out.println(la[la.length-1]);				//la 배열의 la.length-1 번째
	}
	public static void printMiddleItem(int[] mi) {
		System.out.println(mi[mi.length/2]);				// length/2
	}
}
