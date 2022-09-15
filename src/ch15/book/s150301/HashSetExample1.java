package ch15.book.s150301;

import java.util.*;

public class HashSetExample1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");								// Java는 이미 저장되어있어서
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");								// 중복저장x
		set.add("iBATIS");
		
		
		int size = set.size();							
		System.out.println("총 객체수: " + size); 		// 저장된 객체수 얻기
		
		Iterator<String> iterator = set.iterator();		// 반복자 얻기
		while(iterator.hasNext()) {						// 객체 수만큼 루핑
			String element = iterator.next();			// 한개의 객체를 가져옴
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");								// 한개의 객체삭제
		set.remove("iBATIS");							// 한개의 객체삭제
		
		System.out.println("총 객체수: " + set.size());	// 저장된 객체수 얻기
		
		iterator = set.iterator();						// 반복자 얻기
		while (iterator.hasNext()) {					// 객체 수만큼 
			String element = iterator.next();
			System.out.println("\t" + element);
		}												// 루핑
		
		System.out.println("향상된 for문");
		for(String element : set) {
			System.out.println(element);
		}
		
		System.out.println("Iterator 사용");
		Iterator<String> iterator2 = set.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		
		System.out.println("forEach 메소드 사용");
		set.forEach((e) -> System.out.println(e));
		
		set.clear();									// 모든 객체를 제거하고 비움
		if(set.isEmpty()) {
			System.out.println("비어 있음");
		}
	}
}
