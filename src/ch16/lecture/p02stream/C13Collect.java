package ch16.lecture.p02stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class C13Collect {
	public static void main(String[] args) {
		List<Integer> list1 = IntStream.range(1, 100)
				.filter(n -> n%2 == 0)
				.boxed()									// int형을 박스형으로 전환
				.collect(Collectors.toList());				// C12 과정을 더욱 간결하게 해결
		
		System.out.println(list1);
	}
}
