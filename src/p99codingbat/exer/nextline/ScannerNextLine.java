package p99codingbat.exer.nextline;

import java.util.Scanner;

public class ScannerNextLine {
	public static void main(String[] args) {
	// nextLine() : 엔터키와 스페이스바 인식
		Scanner scan = new Scanner(System.in);
		
		String str2 = scan.nextLine();
		System.out.println("str2 -> " + str2);
	}
}

