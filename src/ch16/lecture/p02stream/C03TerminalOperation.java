package ch16.lecture.p02stream;

import java.util.Optional;
import java.util.stream.Stream;

public class C03TerminalOperation {
	public static void main(String[] args) {
		Stream<String> str1 = Stream.of("ironman", "panther", "widow", "spider", "captain");
		str1.forEach((e) -> System.out.println(e));				// forEach 종료연산
		
		Stream<String> str2 = Stream.of("ironman", "panther", "widow", "spider", "captain");
		Optional<String> o1 = str2.reduce((a, b) -> a + ", " + b);
		System.out.println(o1.get());
		
		Stream<String> str3 = Stream.of("ironman", "panther", "widow", "spider", "captain");
		String o2 = str3.reduce("heros", (a, b) -> a + ", " + b);     // 출력값이 있기 때문에 Optional이 아니다
		System.out.println(o2);
	}
}
