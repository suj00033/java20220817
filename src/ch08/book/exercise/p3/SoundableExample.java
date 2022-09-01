package ch08.book.exercise.p3;

public class SoundableExample {
	private static void printSound(Soundable soundable) {
								// 인터페이스
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
		
	}
}
