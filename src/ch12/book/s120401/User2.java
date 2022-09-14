package ch12.book.s120401;

public class User2 extends Thread {
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User2");								// 스레드 User2로 이름을 설정
		this.calculator = calculator;						// 공유 객체인 Calculator를 필드에 저장
	}
	
	public void run() {										// 공유 객체인 Calculator의 메모리에 50을 저장
		calculator.setMemory(50);
	}
}
