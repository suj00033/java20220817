package ch04.lecture.p01control;

import java.util.Scanner;

public class C18GuessNumber {
	public static void main(String[] args) {
		// 컴퓨터가 1~100 random
		// 사용자로부터 입력을 받아 컴퓨터가 고른 숫자와 같으면 프로그램 종료, 아니면 계속 반복
		
		Scanner scanner = new Scanner(System.in);
		// ctrl + shift + o : import 추가
		
		
		System.out.println("1~100 숫자 입력하세요.");
		int pc = (int) (Math.random() * 100 + 1);	
		 
		while (true) {
			
			int user = scanner.nextInt();
			
			if (user == pc) {
				System.out.println("맞췄습니다.");
				break;
			} else if (user < pc){
				System.out.println("더 큰 수를 입력하세요.");
			} else {
				System.out.println("더 작은 수를 입력하세요.");
			}
			
		}
	}
}
