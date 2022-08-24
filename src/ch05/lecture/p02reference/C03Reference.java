package ch05.lecture.p02reference;

public class C03Reference {
	public static void main(String[] args) {
		//03참조타입.png
		
		int[] a = {3, 4, 5};
		int[] b = a;
		
		System.out.println(b[2]); // 5
		
		a = new int[] {9, 8, 7};	// new int[] 호출될때마다 새로운 주소를 할당
		
		System.out.println(b[2]); // 5,     배열a만 변경됨
		
	}
}
