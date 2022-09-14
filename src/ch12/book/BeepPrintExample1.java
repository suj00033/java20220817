package ch12.book;

import java.awt.*;

public class BeepPrintExample1 {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (Exception e) {							// 아래로 순차진행
				
			}
			
			for (int k=0; k<5; k++) {						// 위의 일이 끝나면 다음으로 순차진행
				System.out.println("띵");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					
				}
			} 
		}
	}
}
