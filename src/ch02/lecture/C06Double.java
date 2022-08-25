package ch02.lecture;

public class C06Double {
	public static void main(String[] args) {
		// 실수형
		// float(4 bytes)
		// double(8 bytes)
		// double이 float보다 큰범위, 더 정교한 표현 가능
		// 실수 literal은 double형
		// float literal 표현은 끝에 F 붙임
		
		double a = 3.14;
		double b = 0.123232231134454657;
		
//		float c = 3.14; // c(4바이트) 3.14(8바이트)라서 담지 못함
//		float d = 0.1738237812479846238794;
		
		float c = 3.14F;  // F
		float d = 0.1738237812479846238794F; // F
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		double f = 0.1; // 10진법 > 2진법
		System.out.println(f);
		
		double g = 0.2;
		
		double h = f + g;
		System.out.println(h); // 실수 근사값을 구하는데 주의할 점이 필요하다
		
		
		System.out.println(half(5));
	}
	public static double half(double a) {
		return a /2;
	}
	public static int half(int a) {
		return a /2;
	}
}
