package ch02.lecture;

public class C11String {
	public static void main(String[] args) {
		// String : 문자열
		
		// char : 문자
		
		char a = '목'; // 작은 따옴표
		String b = "목요일"; // 큰 따옴표
		String c = ""; // 빈 문자열
		
		// + (연결연산)의 결과는 String
		String d = "hello";
		char e = '!';
		String f = d + e;
		System.out.println(f);
		
		System.out.println(d + 100); // String g = d + 100;
		
		System.out.println(d + 3.14);
		
		System.out.println(d + true);
		
		// 참조타입(객체) ; 필드와 메소드가 있음
		String k = "egg";
		char q = k.charAt(0); // charAt 메소드 (정수값);
		int p = k.charAt(0);
		
		char n = k.charAt(0); // 'e'
		char o = k.charAt(1); // 'g'
		char j = k.charAt(2); // 'g'
		
		System.out.println(n);
		System.out.println(o);
		System.out.println(j);
		
//		k.charAt(3); // IndexOutOfBoundsException 던져짐(발생)
		
		// length : 길이 리턴
		int t = k.length();
		System.out.println(t);
		
		String g = "javascript";
		System.out.println(g.length());
		
		System.out.println("hello world".length());
		System.out.println("".length());
		System.out.println(g.charAt(g.length()-1));
		
		// substring
		
		String i = g.substring(0); // 0~10까지 가능
		System.out.println(i);
		System.out.println(g.substring(1));
		System.out.println(g.substring(2));
		System.out.println(g.substring(3));
		System.out.println(g.substring(5));
		System.out.println(g.substring(9));
		System.out.println(g.substring(10)); // 10에서는 아무것도 출력되지않음
		
		// substring(int, int)
		System.out.println(g.substring(0, 9)); // 실제로는 8(9-1)까지임
		System.out.println(g.substring(0, 10));// 10을 넣어줘야 완전한 단어가 나옴
		System.out.println(g.substring(0, 4));
		System.out.println(g.substring(2, 4));
		}
}
