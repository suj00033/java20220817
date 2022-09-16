package ch15.lecture.p04sortedSet;

import java.util.*;

public class C01SortedSet {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();				// 먼저 넣은 값부터
		Set<String> set2 = new TreeSet<>();				// 제일 작은 값부터
		
		set1.add("100");
		set1.add("200");
		set1.add("3");
		set1.add("99");
		set1.add("-1");

		set2.add("100");				
		set2.add("200");
		set2.add("3");
		set2.add("99");
		set2.add("-1");
		
		System.out.println(set1);
		System.out.println(set2);
		
	}
}
