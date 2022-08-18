package ch02.lecture;

public class C08TypeConversion {
	public static void main(String[] args) {
		// 타입변환
		// 작은 타입에서 큰 타입으로는 자동 변환된다
		// 큰 타입에서 작은 타입으로는 강제 변환된다(cast 연산, casting)
		
		// 자동 형변환(preomotion) : 작은에서 큰
		int a = 33;
		short b = 55;
		
		a = b; // 자동 형변환
		
		char c = '가';
		a = c;
		
		long d = c;
		
//		short e = c; // 안됨
		
		float f = 3.14F; // 4바이트
		double g = f;	 // 8바이트
		
		// 정수형 -> 실수형
		int h = 999;
		float i = h;
		double j = h;
		long k = 99999L;
		float l = k;
		double m = k;
		
		boolean n = true;
//		int o = n; 안됨
		
		
		// 강제 형변환(casting): 큰에서 작은
		long q = 9999999L;
//		int p = q; 8바이트에서 4바이트로 못바꾸기에
		int r = (int) q;		// 강제 형변환을 통해 강제로 바꿔준다
		System.out.println(r);
		
		q = 30_0000_0000L;
		r = (int) q; // 값을 잃을 수 있다
		System.out.println(r);
		
		// 실수형 -> 정수형
		float s = 3.14F;
//		int t = s; 안됨
		int u = (int) s;
		System.out.println(u);
		
		double v = 3.14;
		u = (int) v; // 소수점 이하 탈락
		System.out.println(u);
	}
}
