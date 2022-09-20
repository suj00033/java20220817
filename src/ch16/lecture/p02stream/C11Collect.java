package ch16.lecture.p02stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class C11Collect {
	public static void main(String[] args) {
		// collect 메소드 : 종료연산
		// 스트림에 있는 원소들을 지정된 컨테이너에 수집하는 일을 함
		
		// param 1 : 원소가 들어갈 컨테이너
		// param 2 : 컨테이너에 원소를 넣는 일
		// param 3 : 여러 컨테이너 병합(merge)
		
		List<Integer> list1 = IntStream.range(1, 100)
				 .filter(e -> e%2 == 0)						
				 .collect(() -> new ArrayList<>(), 				// 새 컨테이너를 람다로 생성
						 (c, k) -> c.add(k), 					// 원소를 컨테이너에 넣음
						 (c1, c2) -> c1.addAll(c2));			// 두 컨테이너 병합
																// parallel이 없기 때문에 병합할 리스트가 없어
		System.out.println(list1);								// (c1, c2) -> {}을 써도 오류x
		
	}
}
