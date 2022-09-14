package ch12.book;

import java.awt.Toolkit;

public class BeepTask implements Runnable {
	public void run() {										// Runnable 인터페이스 안에 run메소드 정의
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
	}
}
