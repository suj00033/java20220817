package ch15.lecture.p02set;

import java.util.HashSet;
import java.util.Set;

public class C01Set {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		// 아이템 (element) 추가
		set.add("iceman");
		set.add("goose");
		set.add("black");
		set.add("hulk");
		
		// element 수
		int size = set.size();
		System.out.println(size);						// 4
		
		// 중복 저장 할 수 없음
		System.out.println(set.add("hulk")); 			// false
		set.add("hulk");
		
		System.out.println(set.size());					// 4
		
		// 이미 있는지 확인
		System.out.println(set.contains("goose"));
		System.out.println(set.contains("batman"));
		
		// 지우기
		
		System.out.println(set.remove("goose"));     // 있는걸 지웠으면 ture
		System.out.println(set.remove("superman"));  // 없는걸 지웠으면 false
		
		System.out.println(set.size());
		
	}
}
