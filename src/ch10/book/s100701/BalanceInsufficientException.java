package ch10.book.s100701;

public class BalanceInsufficientException extends Exception {
	public BalanceInsufficientException() { }
	public BalanceInsufficientException(String message) {
		super(message);
	}
}
