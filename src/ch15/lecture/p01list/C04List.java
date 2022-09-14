package ch15.lecture.p01list;

import java.util.ArrayList;
import java.util.List;

public class C04List {
	public static void main(String[] args) {
		// List : 순서가 있다
		List<String> list1 = new ArrayList<>();
		list1.add("java");
		list1.add("css");
		list1.add("java");
		list1.add(null);
		list1.add(null);
		list1.add("java");						// 중복된 아이템을 넣어도 순서가 있다
		
		System.out.println(list1);
		
	}
}
