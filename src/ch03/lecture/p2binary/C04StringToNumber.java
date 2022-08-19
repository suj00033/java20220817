package ch03.lecture.p2binary;

public class C04StringToNumber {
	public static void main(String[] args) {
		String a = "10";
		int b = 30;
		
		System.out.println(a + b);
		
		int c = Integer.valueOf(a);			// string을 int로 변경취급
		
		System.out.println(c + b);
		
		String d = "3.14";
		double e = 9.8;
		
		System.out.println(d + e);
		double f = Double.valueOf(d);
		System.out.println(f + e);
		System.out.println(Double.valueOf(d) + e);
		
		String g = "Infinity";
		System.out.println(g + e);
		System.out.println(Double.valueOf(g) + e);
		
		String h = "NaN";
		System.out.println(Double.valueOf(h) + e);
		
		// 기본 타입과 매치되는 참조 타입
		// byte : Byte
		// short : Short
		// int : Integer
		// long : Long
		// float : Float
		// double : Double
		// char : Character
		// boolean : Boolean
	}
}
