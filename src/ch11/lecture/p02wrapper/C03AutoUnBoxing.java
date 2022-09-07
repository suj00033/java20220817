package ch11.lecture.p02wrapper;

public class C03AutoUnBoxing {
	public static void main(String[] args) {
		Integer a = 99;
		
		// 참조타입을 기본타입으로 변경 (unboxing)
		int b = a.intValue();
		
		// 참조타입을 기본타입으로 자동변경 (auto unboxing)
		int c = a; 				// ok
		
		Object d = 99;
//		Integer e = d; 				// 오류
//		int f = d;					// 오류
		
		int g = (Integer) d;		// 으로 해야 오류가 안뜸
		
		Object[] arr = {"java", 3, 3.14};
		String s = (String) arr[0];
		Integer i = (Integer) arr[1];
		double j = (Double) arr[2];				// 얘도 되고
				
		double k = (double) arr[2];				// 얘도 됨
		System.out.println("프로그램 실행 이어감");
	}
}
