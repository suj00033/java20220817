package ch12.book;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		Runnable beepTask = new BeepTask();					// beepTask 객체를 생성하여
		Thread thread = new Thread(beepTask);				// Thread 정의
		thread.start();										// 소리 쓰레드 실행
		
		for(int i=0; i<5; i++) {							// 문자 쓰레드와 함께 동시 실행
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
	}
}
