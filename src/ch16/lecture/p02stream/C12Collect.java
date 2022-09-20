package ch16.lecture.p02stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class C12Collect {
	public static void main(String[] args) {
		List<Integer> list1 = IntStream.range(1, 100)
							.parallel()
							.filter(n -> n%2 == 0)				
							.collect(() -> new ArrayList<>(), 	// 새 컨테이너 생성
									(r, e) -> r.add(e),			// 원소를 컨테이너에 넣음
									(r1, r2) -> r1.addAll(r2)); // 두 컨테이너 병합(r은 ArrayList, e는 원소)
																// (r1, r2) -> {} 오류남 
		System.out.println(list1);								// 병합을 해야하기 때문에 리스트가 2개 필요함
	}
}
