package ch08.book.exercise.p5;

public class ActionExample {
	public static void main(String[] args) {
		Action action = new Action() {							// new Action(); 원래 안되지만 {};몸통이 클래스를 구현
			@Override
			public void work() {								// 추상메소드 재정의
				System.out.println("복사를 합니다.");
			
			}
		};
		action.work();											// 재정의된 메소드 실행
	}
}
