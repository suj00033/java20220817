package ch05.lecture.p01array;

public class C01Array {
	public static void main(String[] args) {
		// array(배열) : 여러 값을 저장하는 공간
		// 타입[]
		
		int[] arr1;            // arr1배열이 저장하는 값의 타입은 int
		double[] arr2;		   // double
		String[] arr3;		   // string
		
//		int arr4[];			   // 해석하기가 어려워 위쪽 형태를 좀더 자주 쓰임
//		double arr5[];
//		String arr6[];
		
		int a;
		a = 3;                 // 인 것처럼 값을 할당한것
		
		
		int[] arr4;
		arr4 = new int[5];     // int 값 5개 저장할 수 있는 공간 생성
		
		
		arr4[0] = 10;		   // index 활용해서 값 저장
		arr4[1] = 11;
		arr4[2] = 99;
		arr4[3] = 100;
		arr4[4] = 200;         // 5번 인텍스는 없음
		
		System.out.println(arr4[0]);
		
		int b = arr4[4];
		System.out.println(a);
	}
}
