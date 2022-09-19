package ch16.lecture.p02stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class C05IntStream {
	public static void main(String[] args) {
		
		// IntStram : 기본타입 int가 요소인 Stream
		
		// 생성방법1 : of static 메소드
		int r1 = IntStream.of(10, 9, 20, 2, 3, -1)
			.sum();
		System.out.println(r1);
		
		
		// 생성방법2 : Arrays.stream static 메소드
		int r2 = Arrays.stream(new int[] {10, 9, 20, 2, 3, -1})
			.sum();
		System.out.println(r2);
		
		// 생성방법3 : IntStream.range static 메소드
		int r3 = IntStream.range(1, 11)						// 1, 11 제외하고
			.sum();
		System.out.println(r3);
		
		int r4 = IntStream.rangeClosed(1, 11)				// 1, 11 포함해서
			.sum();
		System.out.println(r4);
		
		System.out.println();
		
		// 생성방법4 : IntStream.generate static 메소드
		IntStream.generate(() -> 1)							// generate만 사용하면 무한히 실행됨
			.limit(5)
			.forEach(e -> System.out.println(e));
		
		System.out.println();
		
		IntStream.generate(() -> (int) (Math.random()*45) + 1)		// 1~45 랜덤하게 6개 뽑기
			.limit(6)
			.forEach(e -> System.out.println(e));
	}
}
