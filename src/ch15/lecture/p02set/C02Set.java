package ch15.lecture.p02set;

import java.util.*;

public class C02Set {
	public static void main(String[] args) {
		// 전체 탐색 방법
		Set<String> set = new HashSet<String>();
		set.add("Java");				
		set.add("spring");				
		set.add("jsp");				
		set.add("Java");
		set.add("css");
		set.add("html");
		
		System.out.println("향상된 for문");
		for(String element : set) {
			System.out.println(element);				// 출력되는 순서는 다를수도있다
		}
		
		System.out.println("Iterator 사용");
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {					// iterator와 어울리는 반복구문은 while이다
			System.out.println(iterator.next());
		}
		
		System.out.println("forEach 메소드 사용");
		set.forEach((e) -> System.out.println(e));
	} 
}
