package p99codingbat.exer.nextline;

import java.util.Scanner;

public class NextLineNextAF {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.next();
		System.out.println("str1 -> " + str1);
		scan.nextLine();
		String str2 = scan.nextLine();
		System.out.println("str2 -> " + str2);
	}
}


// nextLine으로 변수를 담기 전에 nextLine 메소드만 호출하여
// 버퍼를 비워주면 아무 문제 없음