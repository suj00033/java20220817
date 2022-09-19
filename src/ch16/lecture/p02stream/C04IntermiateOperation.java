package ch16.lecture.p02stream;

import java.util.SortedSet;
import java.util.stream.Stream;

public class C04IntermiateOperation {
	public static void main(String[] args) {
		// 중간연산(메소드) : 리턴 타입 -> xxxStream
		
		// limit : element 갯수 제한
		Integer o1 = Stream.of(3, 4, 5, 9, -1, 10, 11)
				.limit(5) 						// limit(5) 앞에서 중간까지 사용
				.max((x, y) -> x - y)
				.get();
		System.out.println(o1);
		
		// skip : element 몇개 무시
		Integer o2 = Stream.of(3, 4, 5, 9, -1, 10, 11)
				.skip(2) 						// 앞에 두개를 무시하고
				.min((x, y) -> x - y)
				.get();
		System.out.println(o2);
		
		// filter : Predicate에서 true 나온 것만 추림
		Integer o3 = Stream.of(3, 4, 5, 6, 7)
				.filter((e) -> e%2 == 0)				// 짝수인것만 추려내겠다
				.reduce((x, y) -> x + y)
				.get();
		System.out.println(o3);
		
		// filter
		Integer o4 = Stream.of(3, 4, 5, 6, 7)
				.filter((e) -> e%2 != 0)				// 홀수만	
				.reduce((x, y) -> x + y)
				.get();
		System.out.println(o4);
		
		// distinct : 중복 제거
		Integer o5 = Stream.of(3, 3, 4, 4, 5, 5, 5, 6, 7)
				.distinct()								// 3, 4, 5를 제거한뒤 수식활용
				.reduce((x, y) -> x + y)
				.get();
		System.out.println(o5);
		
		System.out.println();
		
		// sorted : 정렬한 스트림 리턴
		Stream.of(5, 3, 0, 7, 9, 1)
			.sorted()						// 도착한대로 정렬(작은 순서부터)
			.forEach(e -> System.out.println(e));
		
		System.out.println();
		
		// 중간연산 조합
		Stream.of(5, 3, 0, 7, 9, 1)
			.sorted()
			.limit(3)
			.forEach(e -> System.out.println(e));
		
		System.out.println();
		
		Stream.of(5, 3, 0, 7, 9, 1)
		.limit(3)							// 5, 3, 0까지 쓰고
		.sorted()							// 도착한대로 정렬
		.forEach(e -> System.out.println(e));
			
	}
}
