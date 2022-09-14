package ch15.lecture.p01list;

import java.util.Iterator;
import java.util.List;

public class C03List {
	public static void main(String[] args) {
		// 모든 아이템 검색
		List<String> list1 = List.of("maverick", "iceman", "rooster", "goose");
		
		for(int i = 0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		System.out.println();
		
		// 향상된 for문
		for(CharSequence item : list1) {				// String, Object 모두 사용 가능
			System.out.println(item);
		}
		
		System.out.println();
		
		// foreach 메소드
		list1.forEach((e) -> System.out.println(e));
		
		System.out.println();
		
		// iterator 사용
		Iterator<String> iterator = list1.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next()); 		// hasNext는 다음 탐색할것이 있을때까지 커서가 다음으로
														// 넘어가면서 탐색
		}
	}
}
