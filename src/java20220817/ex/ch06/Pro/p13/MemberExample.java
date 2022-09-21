package java20220817.ex.ch06.Pro.p13;

public class MemberExample {
	public static void main(String[] args) {
		Member user1 = new Member("홍길동", "hong");
		Member user2 = new Member("강자바", "java");
		
		System.out.println(user1.name);
		System.out.println(user1.id);

		System.out.println(user2.name);
		System.out.println(user2.id);
		
	}
}
