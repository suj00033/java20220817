package ch03.lecture.p2binary;

public class C09Assignment {
	public static void main(String[] args) {
		
		// 대입연산자 : =, +=, -=, *=, /-, %=            오른쪽부터 왼쪽으로 순서.
		
		int i = 3;
		int j = 5;
		
		int k = i;
		System.out.println(k); 			// 3
		
		k += j; 						// k = k + j;
		System.out.println(k); 			// 8
		
		k -= i;							// k = k - i;
		System.out.println(k); 			// 5
		
		k *= i;							// k = k * i;
		System.out.println(k);			// 15
 	}
}
