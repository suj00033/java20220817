package ch15.book.s150201;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayAsListExample {										// 전체탐색
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("홍길동", "신용권", "김자바");
		for(String name : list1) {
			System.out.println(name);
		}
		
		System.out.println();
		
		for(String name : list1) {
			System.out.println(name);
		}
		
		System.out.println();
		
		list1.forEach((e)->System.out.println(e));
		
		System.out.println();
		
		Iterator<String> iterator1 = list1.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		
		List<Integer> list2 = Arrays.asList(1, 2, 3);
		for(int val : list2) {
			System.out.println(val);
		}
		
		System.out.println();
		
		for(int val : list2) {
			System.out.println(val);
		}
		
		System.out.println();
		
		list2.forEach((e)->System.out.println(e));
		
		System.out.println();
		
		Iterator<Integer> iterator2 = list2.iterator();
			while (iterator2.hasNext()) {
				System.out.println(iterator2.next());
			}
	}
}

