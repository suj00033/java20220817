package ch12.book.s120203;

public class CalcThread extends Thread {
	public CalcThread(String name) {
		setName(name);
	}
	
	public void run() {
		for(int i=0; i<2000000000; i++) {						// 20억번 돌림
			
		}
		System.out.println(getName());
	}
}
