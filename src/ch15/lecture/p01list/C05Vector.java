package ch15.lecture.p01list;

import java.util.List;
import java.util.Vector;

public class C05Vector {
	public static void main(String[] args) {
		List<String> list1 = new Vector<>();					// Vector 1.0 버전부터, ArrayList는 1.2 버전부터
		list1.add("java");										// 특별한일 없으면 ArrayList 쓴다
		list1.add("css");
		
		System.out.println(list1);
		list1.remove(0);
		
		System.out.println(list1);
		
		list1.add(0, "spring");
		System.out.println(list1);
		
		for (String item : list1) {
			System.out.println(item);
		}
	}
}
