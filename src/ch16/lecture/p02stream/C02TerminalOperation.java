package ch16.lecture.p02stream;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C02TerminalOperation {
	public static void main(String[] args) {
		// stream 연산          
		// 1. 중간 연산 (중간처리)   Intermediate operation
		// 2. 종료 연산 (초최종처리) Terminal operation
		
		// 구분법: 중간 연산(method)은 리턴 타입이 xxxStream
		// 		   최종 연산(method)은 리턴 타입이 Stream이 아님(주로)
		
		
		// findAny : 아무거나 하나 (종료연산)
		Stream<String> str1 = List.of("java", "css", "spring", "jsp", "html").stream();
		Optional<String> opt1 = str1.findAny();				//Optional은 객체 안에 값이 있거나 없거나 둘중 하나를 따라서 감
		System.out.println(opt1.orElse("없네요."));
		
		// findFirst : 첫번째 element (종료연산)
		Stream<String> str2 = List.of("java", "css", "spring", "html", "jsp").stream();
		Optional<String> opt2 = str2.findFirst();			// 오류가 나는 이유는 이미 findAny에서 사용한뒤 흘러갔기 때문에
		System.out.println(opt2.orElse("없네요."));						// 재사용이 되지않는다. 다시 만들어야 실행가능
	
		// max : 가장 큰 element (종료연산)
		Stream<String> str3 = List.of("java", "css", "spring", "jsp", "html").stream();
		Optional<String> opt3 = str3.max((a, b) -> a.compareTo(b));
		System.out.println(opt3.get());
		// compareTo() 숫자형 비교는 크다(1), 같다(0), 작다(-1)로 결과값 리턴
		// 문자열이 포함되어있으며 비교불가능한 지점일 경우, 아스키 값 기준으로 리턴
		
		// min : 가장 작은 element (종료연산)
		Stream<String> stream4 = List.of("java", "css", "spring", "html", "jsp").stream();
		Optional<String> option4 = stream4.min((a, b) -> a.compareTo(b));
		System.out.println(option4.get());
		
		// IntStream
		IntStream str5 = IntStream.of(100, 200, 50, -50, 7, 6);
		OptionalInt max1 = str5.max();
		System.out.println(max1.getAsInt());

		IntStream str6 = IntStream.of(100, 200, 50, -50, 7, 6);
		OptionalInt min1 = str6.min();
		System.out.println(min1.getAsInt());
		
	}
}
