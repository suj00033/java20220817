package ch12.lecture;

import java.awt.Toolkit;

public class C01Thread {
	public static void main(String[] args) throws InterruptedException {
		// 문자 출력
		for (int i=0; i<5; i++) {
			System.out.println("띵");
			
			// 실행 잠시 멈춤
			Thread.sleep(1000);									// 1초 잠시 기다렸다가 실행
		}
		
		// 소리 출력
		Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			
			// 실행 잠시 멈춤
			Thread.sleep(1000);
		}
	}
}
// 메인 스레드라서 차례로 실행됨
// 두개의 스레드를 만들면 두개의 기능이 동시에 실행될수 있음
