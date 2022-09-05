package ch10.book.s1008;

import ch10.book.s100701.BalanceInsufficientException;
import ch10.book.s100702.Account;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		
		// 예금하기
		account.deposit(10000);
		System.out.println("예금액: " + account.getBalance());
	
		// 출금하기
		try {
			account.withdraw(30000);							// 예외가 떠넘겨짐
		} catch (BalanceInsufficientException e) {				// 예외 객체 생성
			String message = e.getMessage();					// 예외 메시지 얻기, 메소드의 리턴값을 얻을 수 있음
			System.out.println(message);
			System.out.println();
			e.printStackTrace(); 								// 예외 추적 후 출력, 예외가 어디서 발생했는지 상세하게 출력
		}
	}
}
