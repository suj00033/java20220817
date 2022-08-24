package ch05.lecture.p02reference;

public class C06Reference {
	public static void main(String[] args) {
		int[] a = {9, 8};
		changeItem(a);					// 주소번지가 arr 바뀐게 x
		
		System.out.println(a[0]);
	}

	private static void changeItem(int[] arr) {
		System.out.println(arr[1]);
		arr = new int[] {3, 4};
		System.out.println(arr[0]);
	}
}
