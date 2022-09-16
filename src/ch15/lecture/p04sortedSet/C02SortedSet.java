package ch15.lecture.p04sortedSet;

import java.util.*;

public class C02SortedSet {
	public static void main(String[] args) {
		SortedSet<Integer> set = new TreeSet<>();	
		
		set.add(300);
		set.add(100);
		set.add(99);
		set.add(10000);
		set.add(-1);
		
		System.out.println(set);
		
		System.out.println(set.first());
		System.out.println(set.last());
		
		System.out.println(set.headSet(100));  	// 100보다 작은 값
		System.out.println(set.tailSet(500));  	// 500보다 큰 값
		
		NavigableSet<Integer> nset = (NavigableSet<Integer>) set;
		
		System.out.println(nset.lower(99));		// 99보다 작은 값
		System.out.println(nset.floor(99));	    // 99이거나 아래 점수
		System.out.println(nset.higher(100));	// 100보다 큰 값
		System.out.println(nset.ceiling(100));	// 100 이거나 큰 점수
		
	}
}
