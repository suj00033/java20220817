package ch04.lecture.p02method;

public class C07Return {
	public static void main(String[] args) {
		
		System.out.println(1);
		
		method1();
		
		System.out.println(2);
	}
	
	public static String method3() {
		return "hello";
	}
	
	public static int method2() {                          // return 3;으로 void에서 int로 변경
		// return : 메소드 종료
		//          오른쪽 값을 호출한 곳으로 반환(return)
		
		// return으로 값을 반환할때
		// 메소드의 리턴 타입과 반환값의 타입이 일치해야함
		return 3;
	}
	
	public static void method1() {
		System.out.println("가");
		
		if (true) {
		return; 					// 메소드 종료
		}
		
		System.out.println("나");   // return에서 메소드가 종료되었기 때문에 실행x
		
	}
}
