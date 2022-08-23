package ch04.book;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);	// Scanner 객체 생성
		String inputString;		
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while(!inputString.equals("q")); 		// q가 같으면 true로 리턴, 그렇지 않으면 false로 리턴
												// == 사용하면 안됨
		System.out.println();
		System.out.println("프로그램 종료");
	}
}
