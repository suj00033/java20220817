package ch15.lecture.p01list;

import java.util.ArrayList;
import java.util.List;

public class C01List {
	public static void main(String[] args) {
		// List : 순서있음
		List<String> list1 = new ArrayList<>();
		
		// add : element(item) 추가
//		list1.add(3);                  				String이므로 숫자는 x
		list1.add("coyote");						// 0번 인덱스
		list1.add("phoenix");						// 1번 인덱스
		list1.add("goose");							// 2번 인덱스
		
		
		// get : element(item) 얻기
		String s1 = list1.get(0);
		String s2 = list1.get(1);
		String s3 = list1.get(2);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		
		// ArrayIndexOutOfBoundsException 주의
//		System.out.println(list1.get(3));	 			// 오류
		
		// size : List의 길이 (아이템의 갯수)
		int len = list1.size();
		
		System.out.println(len);
		
		System.out.println("마지막 아이템 " +  list1.get(list1.size() - 1)); 		// 마지막 아이템 문자 출력
	}
}
