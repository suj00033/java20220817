package ch15.lecture.p01list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02List {
	public static void main(String[] args) {
		// 리스트 만드는 방법1												// 왠만하면 방법1을 사용하자
		List<String> list1 = new ArrayList<>();
		list1.add("java");
		list1.add("css");
		list1.add("spring");
		System.out.println(list1);
		
		// 리스트 만드는 방법2
		List<String> list2 = Arrays.asList("java", "css", "spring");		// asList 여러 파라미터를 받을 수 있음
		System.out.println(list2);
		
		// 리스트 만드는 방법3												// 자바9버전부터
		List<String> list3 = List.of("java", "css", "spring");
		System.out.println(list3);
		
		// 주의!! 2, 3은 변경 불가능
		list1.add("jsp");
//		list2.add("jsp");									// 오류
//		list3.add("jsp");									// 오류
		
		// 주의 3은 변경도 불가능
		list1.set(0, "jsp");
		list2.set(0, "jsp");
//		list3.set(0, "jsp");								// 오류
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		
	}
}
