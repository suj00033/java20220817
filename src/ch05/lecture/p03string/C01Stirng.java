package ch05.lecture.p03string;

public class C01Stirng {
	// 06문자열.png 참고
	public static void main(String[] args) {
		int a = 3;
		int b = 3;
		
		System.out.println(a == b); // true
		
		String s1 = "java";
		String s2 = "java";
		String s3 = "ja";
		String s4 = "va";
		String s5 = s3 + s4;

		System.out.println(s1);
		System.out.println(s5);
		
		System.out.println(s1 == s2); // true
		System.out.println(s1 == s5); // false
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));     // 실제 참조값을 보여누는 실행어
		
		System.out.println(System.identityHashCode(s5));	// 안에 내용물이 같더라도 참조값이 다르다.
		
		// string content 비교
		System.out.println(s1.equals(s5));     // true
		System.out.println(s1.contains(s5));   // true
	}
}
