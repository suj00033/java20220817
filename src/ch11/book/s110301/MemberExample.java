package ch11.book.s110301;

public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {									// 매개값 Member
			System.out.println("obj과 obj2는 동등합니다.");		// id 필드값도 동일하여 true
		} else {
			System.out.println("obj과 obj2는 동등하지 않습니다.");
		}
		
		if(obj1.equals(obj3)) {									// 매가값은 Member이지만
			System.out.println("obj과 obj3은 동등합니다.");		// id 필드값이 다르므로 false
		} else {
			System.out.println("obj과 obj3은 동등하지 않습니다.");
		}
	}
}
