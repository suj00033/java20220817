package ch05.lecture.p02reference;

public class C07Reference {
	public static void main(String[] args) {
		int[] a = {9, 8, 7};
		System.out.println(a[0]);					// 9
		
		a = changeItem(a);
		
		System.out.println(a[0]);       			// 3
	}

	private static int[] changeItem(int[] arr) {    // arr가 23을 받음
		System.out.println(arr[0]);				    // 9
		arr = new int[] {3, 4, 5};					// 코드받기 직전에는 arr 23, 직후에는 arr 30으로 변함
		return arr;									// 리턴값을 30으로 받음
	}
}
