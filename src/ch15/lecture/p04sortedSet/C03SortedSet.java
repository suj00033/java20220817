package ch15.lecture.p04sortedSet;

import java.util.TreeSet;

public class C03SortedSet {
	public static void main(String[] args) {
		TreeSet<Integer> set1 = new TreeSet<Integer>();
		TreeSet<Integer> set2 = new TreeSet<Integer>((a, b) -> a - b);
		TreeSet<Integer> set3 = new TreeSet<Integer>((a, b) -> b - a);
		
		set1.add(200);
		set1.add(50);
		set1.add(10);
		
		System.out.println(set1); 			// 작은 순서대로
		
		set2.add(200);
		set2.add(50);
		set2.add(10);
		System.out.println(set2);

		set3.add(200);
		set3.add(50);
		set3.add(10);
		System.out.println(set3);			// 200이 50보다 작다고 정의하도록
	}
}
