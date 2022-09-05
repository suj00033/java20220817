package ch10.lecture.p06message;

public class C01Message {
	public static void main(String[] args) {
		System.out.println("메인 코드 1");
		method1();
		
		System.out.println("메인 실행 이어감~");
	}

	private static void method1() {
		System.out.println("메소드1 코드");
		try {
			method2();
		} catch (Exception e) {
			// TODO Auto-generated catch block					로그(메세지) 꼭 남기기
//			System.out.println("익셉션 발생함!!");				// 이렇게 쓰거나
//			System.out.println(e.getMessage());					// 25줄 출력 이렇게 써도 상관없으나
			e.printStackTrace(); 								// 왠만하면 자동완성하면 나오는 메시지 그대로 냅두기
		}
		System.out.println("메소드1 실행 이어감");
		
	}

	private static void method2() throws Exception {
		throw new Exception("어떤 이유로 발생했는지");
		
	}
}
