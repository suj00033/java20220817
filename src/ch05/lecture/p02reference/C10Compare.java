package ch05.lecture.p02reference;

import java.util.Arrays;

public class C10Compare {
	// 05참초타입비교.png
	public static void main(String[] args) {
		int a = 3;
		int b = 3;
		
		System.out.println(a == b);     			// true
		
		int[] c = new int[] {3, 4, 5};
		int[] d = new int[] {3, 4, 5};
		
		System.out.println(c == d);  				// false > heap 주소값이 다르기 때문에 값이 다름
		// content 비교 => true
		System.out.println(Arrays.equals(c, d)); 	// true
		
		int[] e = c;
		
		e[0] = 33;
		System.out.println(c[0]); 	 				// 33
		
		System.out.println(e == c);
		System.out.println(Arrays.equals(c, d)); // false
	}
}
