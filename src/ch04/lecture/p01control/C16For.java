package ch04.lecture.p01control;

import java.util.Scanner;

public class C16For {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		System.out.print("마지막 정수 입력 (1보다 큰수) : ");
//		int last = scanner.nextInt();							// last의 수는 콘솔에 입력한 정수형 숫자
//		
//		int sum = 0;
//		
//		for (int i = 1; i <= last; i++) {
//			sum += i;
//		}
//		
//		System.out.println("1부터 " + last + " 까지의 합 : " + sum);
		
		System.out.println("첫번째 정수 입력 : ");
		int first = scanner.nextInt();
		
		System.out.println("마지막 정수 입력 (" + first + "보다 큰수) : ");
		int last = scanner.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= last; i++) {
			sum += i;
		}
		
		System.out.println(first + " 부터 " + last + " 까지의 합 : " + sum);
	}
}
