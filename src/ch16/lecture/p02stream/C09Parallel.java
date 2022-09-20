package ch16.lecture.p02stream;

import java.util.List;

public class C09Parallel {
	public static void main(String[] args) {
		List<String> list1 = List.of("java", "spring", "css", "jsp", "html");
		
//		list1.stream();	 				// 한줄짜리
		list1.parallelStream()   		// 여러줄짜리
		 	 .forEach((e) -> System.out.println(e));					// 정렬순서가 섞여서 나옴
		
		System.out.println();
		
		list1.parallelStream()
			 .forEachOrdered((e) -> System.out.println(e)); 			// 정렬순서 보장되어서 출력됨
	}
}
