package p99codingbat.exer.nextline;

import java.util.Scanner;

public class ScannerNext {
	public static void main(String[] args) {
	// next() : 처음 문자열만 인식. 즉, 엔터키와 스페이스바 인식x
		Scanner scan = new Scanner(System.in);
		
		String str1 = scan.next();
		System.out.println("str1 -> " + str1);
	}
}
