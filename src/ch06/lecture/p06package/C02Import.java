package ch06.lecture.p06package;

import java.util.Scanner;

public class C02Import {
	public static void main(String[] args) {
		// 클래스 full name 사용
		java.util.Scanner scanner = new java.util.Scanner("");
		
		// 다른 패키지의 클래스명에서 패키지명 생략하려면 import 사용
//		Scanner scanner2 = new Scanner(""); 만 쓰면 오류
		Scanner scanner2 = new Scanner("");        // ctrl + shift + o 누르면 필요한 import값을 줌 
	}
}
