package ch16.lecture.p02stream;

import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class C20Collect {
	public static void main(String[] args) {
		String res = IntStream.of(9, 7, 1, 0)					// int형
				.boxed()										// Stream<Integer>형으로 만들기 위해 boxed() 사용
				.map(String::valueOf) 							// Integer형은 Collector 지원안하기 때문에 맵핑을 해줘야함
				.collect(Collectors.joining(", "));				// 적절한 Collector를 넣어서
		
		System.out.println(res); 			// "9, 7, 1, 0" 코드 완성
	}
}
