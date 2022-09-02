package ch09.book.s090502;

public class Anonymous {
	// 필드 초기값으로 대입
	RemoteControl field = new RemoteControl() {						// 필드 선언과
		
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
			
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
			
		}
	};																// 초기값 대입
	
	void method1() {
		// 로컬 변수값으로 대입
		RemoteControl localVar = new RemoteControl() {				// 로컬 변수 선언과
			
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
				
			}
		};															// 초기값 대입
		
		// 로컬 변수 사용
		localVar.turnOn();
	}
	
		void method2(RemoteControl re) {
			re.turnOn();
		}
}
