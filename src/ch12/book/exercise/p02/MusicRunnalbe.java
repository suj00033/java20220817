package ch12.book.exercise.p02;

public class MusicRunnalbe implements Runnable {
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("음악을 재생합니다.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}
