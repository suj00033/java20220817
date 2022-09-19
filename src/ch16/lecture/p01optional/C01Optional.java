package ch16.lecture.p01optional;

import java.util.Optional;

public class C01Optional {
	public static void main(String[] args) {
		Optional<String> obj1 = Optional.empty();
		Optional<String> obj2 = Optional.of("java");
		
		System.out.println(obj1.isEmpty()); // true
		System.out.println(obj2.isEmpty()); // false
		
		System.out.println(obj1.isPresent()); // 현재 객체에 값이 있는가
		System.out.println(obj2.isPresent()); 
		
		String str2 = obj2.get();
		System.out.println(str2);

//		String str1 = obj1.get();			// 값이 없는데 꺼내려고 하면 Exception 뜸
//		System.out.println(str1);
		
		String str1 = obj1.orElse("empty string");
		System.out.println(str1);
		System.out.println(obj2.orElse("empty string"));
		
	}
}
