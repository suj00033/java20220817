package ch16.lecture.p02stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C06IntStream {
	public static void main(String[] args) {
		// 1~10 출력
		System.out.println("[1~10 출력]");
		IntStream.rangeClosed(1, 10)
			.forEach(e -> System.out.println(e));
		
		System.out.println("-------------------");
		
		// 1~100까지의 합 출력
		System.out.println("[1~100까지 합 출력]");		
		int r1 = IntStream.rangeClosed(1, 100)
				.sum();
		System.out.println(r1);
		
		System.out.println("-------------------");
			
		// 1~100까지의 수 중 홀수의 합 출력
		System.out.println("[1~100까지의 수 중 홀수의 합 출력]");
		int r2 = IntStream.rangeClosed(1, 100)
				.filter((e) -> e%2 != 0)
				.sum();
		System.out.println(r2);
		
		System.out.println("-------------------");
			
		// [5, 10, 20, 1, 6]의 평균 구하기
		// 풀이1
		System.out.println("[[5, 10, 20, 1, 6]의 평균 구하기]");
		double r3 = (double) Arrays.stream(new int[] {5, 10, 20, 1, 6})
				.average()
				.orElse(0);		// orElse() 값이 저장되어있지 않으면 0
		System.out.println(r3);
		// 풀이2
		double r4 = IntStream.of(5, 10, 20, 1, 6)
					.average()
					.getAsDouble();
		System.out.println(r4);
		
		System.out.println("-------------------");
				
		// 주사위(1~6) 5번 던진 결과 출력
		System.out.println("[주사위(1~6) 5번 던진 결과 출력]");
		IntStream.generate(() -> (int) (Math.random()*6)+1)
			.limit(5)
			.forEach(e -> System.out.println(e));
		
		System.out.println("-------------------");
		
		// 로또번호(1~45) 6개 작은수부터 출력 (중복없이)
		System.out.println("[로또번호(1~45) 6개 작은수부터 출력 (중복없이)]");
		IntStream.generate(() -> (int) (Math.random()*45) + 1)
			.limit(6)
			.distinct()
			.sorted()
			.forEach(e -> System.out.println(e));
	}
}

// 참고 사이트 : https://ict-nroo.tistory.com/43
// 			     https://hyejin.tistory.com/307	 
