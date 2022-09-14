package ch12.book.s120401;

public class MainThreadExample {
	public static void main(String[] args) {
		Calculator calculartor = new Calculator();
		User1 user1 = new User1();						// User1 스레드 생성
		user1.setCalculator(calculartor);				// 공유 객체 설정
		user1.start();									// User1 스레드 시작

		User2 user2 = new User2();						// User2 스레드 생성
		user2.setCalculator(calculartor);
		user2.start();
		
		
	}
}
