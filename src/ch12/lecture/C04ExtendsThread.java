package ch12.lecture;

import java.awt.Toolkit;

public class C04ExtendsThread {
	public static void main(String[] args) {
		Thread t3 = new Thread();
		Thread t4 = new Thread();
		
		t3.start();
		t4.start();
	}
		
	
}

class Task4 extends Thread {
	public void run() {
		// 문자 출력
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
		
	}


class Task3 extends Thread {
	public void run() {
		// 소리 출력
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
	}
