package ch16.lecture.p02stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class C01Stream {
	public static void main(String[] args) {
		List<String> list = List.of("java", "css", "spring", "js", "html");
		Stream<String> stream1 = list.stream();
				
		Set<String> set = Set.of("ironman", "batman", "iceman");
		Stream<String> stream2 = set.stream();
		
		String[] arr = {"dog", "cat", "rabbit"};
		Stream<String> stream3 = Arrays.stream(arr);
		
		Stream<String> stream4 = Stream.of("captian", "widow", "panther");
		
		
		
		// Stream은 흘러가는 흐름 속에 있는 여러가지 객체들이다
	}
}
