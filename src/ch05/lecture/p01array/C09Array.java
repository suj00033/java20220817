package ch05.lecture.p01array;

public class C09Array {
	public static void main(String[] args) {
		int[][] a = {{3,4}, {7,8}, {99, 98}};  // a의 아이템 개수: 3개
		int[][] b = {{1,2,3}, {4,5,6}};        // b의 아이템 개수: 2개
		
		
		System.out.println(a.length); 		   // 3
		System.out.println(b.length);
		
		System.out.println(a[0].length);	   //a의 0번째 배열 아이템 길이
		System.out.println(a[1].length);
		System.out.println(a[2].length);
		
		int[] c = new int[3];
		int[][] d = new int[2][3];			// new int[아이템 개수][아이템 길이]
		
		System.out.println(d.length);		// d의 아이템 개수
		System.out.println(d[0].length);	// d의 배열 안에 있는 아이템 길이
	}
}
