package ch06.lecture.p06package;

//import java.lang.*;     생략가능

public class C03Import {
	public static void main(String[] args) {
		java.lang.String s1 = "java";					  // java.lang.생략가능
		String s2 = "maverick";
		
		java.lang.System.out.println("hello");           // java.lang.생략가능
		System.out.println("hello");
	}
}
