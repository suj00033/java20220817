package ch12.lecture;

public class C07SynchronizedBlock {
	public static void main(String[] args) throws InterruptedException {
		int[] arr = {0};
		
		Object lock = new Object();
		
		Thread t1 = new Thread(() -> {
			for (int i=0; i<100000; i++) {
				// 동기화 블럭 (객체)
				// 객체를 획득해야 블럭 실행가능
				// 블럭 실행 후 객체를 다시 반납
				synchronized (lock) {					// 이 블록을 실행하기 이전에 lock 객체를 획득해야 실행 가능		
					arr[0]++;							// 이 메소드를 실행할때 lock을 이곳에서 먼저 획득했기 때문에
				}
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i=0; i<1000000; i++) {
				synchronized (lock) {				// 이 메소드와 동시에 실행이 불가능
					arr[0]++;
				}
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(arr[0]);
	}
}
