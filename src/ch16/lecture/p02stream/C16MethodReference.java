package ch16.lecture.p02stream;

import java.util.stream.IntStream;

public class C16MethodReference {
	public static void main(String[] args) {
		int max = IntStream.of(3, 9, 1, 0, 10)
			.boxed()
//			.max((x, y) -> x.compareTo(y))
			.max(Integer::compareTo)
			.get();
		
		System.out.println(max);
		
		int max2 = IntStream.of(3, 9, 1, 0, 10)
				.boxed()
//				.max((a, b) -> Integer.compare(a, b))	// 파라미터 순서가 같기 때문에
				.max(Integer::compareTo)				// method reference 사용가능		
				.get();
		
		System.out.println(max2);
	}
}
