package p99codingbat.exer.nextline;

import java.util.Scanner;

public class NextLineNext {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.next();
		System.out.println("str1 -> " + str1);
		String str2 = scan.nextLine();
		System.out.println("str2 -> " + str2);
	}
}
// a a를 넣고 출력한 결과 a하나 박탈
// next()로 받고 남은 a가 nextLine으로 넘어가면서
// 버려진 a가 버퍼에 남겨져 이미 저장되어있는 기존 문자열을
// 던져버리는 현상이 나타난다.
// 때문에 버퍼를 처리해야함
