package ch16.book.p06;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", 30),
				new Member("신용권", 40),
				new Member("김자바", 26)
				);
		
		double avg = list.stream()
				.mapToInt((m) -> m.getAge())				// mapToInt(Member::getAge)으로도 가능
				.average()
				.getAsDouble();
//		
//double avg = 0.0;
//		
//		for (Member member : list) {
//			avg += member.getAge();
//		}
//		
//		avg /= list.size();

				
				
	
				
		System.out.println("평균 나이: " + avg);		
	}
	
	static class Member {
		private String name;
		private int age;
		
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	}
}
