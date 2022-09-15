package ch15.lecture.p02set;

import java.util.*;

public class C03Set {
	public static void main(String[] args) {
		// Set 만들기
		Set<String> set1 = new HashSet<>();						// 수정 가능한 Set
		set1.add("bob");
		set1.add("hangman");
		set1.add("goose");
		
		set1.remove("goose");
		
		System.out.println(set1);
		
		// 수정 불가능한 Set
		Set<String> set2 = Set.of("thor", "hulk", "batman");
//		set2.add("super");    (x)
//		set2.remove("hulk");  (x)
		
		System.out.println(set2.contains("thor"));				// set2를 수정시키는 메소드가 아니기때문에
		System.out.println(set2.size());						// 실행 가능
		
		System.out.println(set2);
		
	}
}
