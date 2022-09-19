package ch16.lecture.p02stream;


import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class C08Mapping {
	public static void main(String[] args) {
		// IntStream (primitive type stream) -> Stream<Integer>
		
		IntStream.of(3, 5, 9, 1, 0)
			.boxed()									// primitive 타입을 wrapper 타입으로 박싱하여 반환한다.
			.sorted((a, b) -> b - a)					// 거꾸로 출력
			.forEach(e -> System.out.println(e));
		
		//
		String res = IntStream.of(3, 5, 9, 1, 0)
				.boxed()								// 참조타입으로 변환
				.sorted((a,b) -> b - a)
				.map(e -> "" + e)
				.reduce((s1, s2) -> s1 + ", " + s2)
				.get();        							// optional이기 때문에 get()으로 불러와야함
		
		System.out.println(res); 						// "9,5,3,1,0"
		
		System.out.println();
		
		String res1 = IntStream.of(3, 5, 9, 1, 0)
				.boxed()
				.sorted((a,b) -> b - a)
				.map((s) -> String.valueOf(s))
				.collect(Collectors.joining(", "));
		
		System.out.println(res1);
	}
}
