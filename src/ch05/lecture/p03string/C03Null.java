package ch05.lecture.p03string;

public class C03Null {
	public static void main(String[] args) {
		int[] a;
		String b;
		String c = "java";		  // 참조하는 객체가 있음
		
		a = null; 				 // 참조하는 객체가 없음
		b = null; 				// 참조하는 객체가 없음
		
		System.out.println(c.length());
		System.out.println(b.length());          // NullPointerException오류메시지가 뜬다
	}
}
