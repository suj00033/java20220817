package ch10.book.exercise.p07;

public class WrongPasswordException extends Exception {
	public WrongPasswordException() {}
	public WrongPasswordException(String message) {
		super(message);									// 부모 클래스 호출
		
	}
}
