package ch16.book.s1604;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("홍길동", "신용권", "김자바", "신용권", "신민철");
		
		names.stream()
			.distinct()											// 중복 제거하고
			.forEach(n -> System.out.println(n));				// 출력
		System.out.println();
		
		names.stream()											// startsWith : 특정 문자로 시작하거나 끝나는지 체크
			.filter(n -> n.startsWith("신"))					// 문자열 "신" 필터링
			.forEach(n -> System.out.println(n));				// 출력
		System.out.println();
		
		names.stream()
			.distinct()											// 중복 제거하고
			.filter(n -> n.startsWith("신"))					// "신" 필터링
			.forEach(n -> System.out.println(n));				// 출력
	}
}
