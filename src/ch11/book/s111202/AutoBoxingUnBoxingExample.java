package ch11.book.s111202;

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		// 자동 Boxing
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());
		
		// 대입시 자동 Unboxing
		int value = obj;
		System.out.println("value: " + value);
		
		// 연산시 자동 Unboxing
		int res = obj + 100;
		System.out.println("result: " + res);
	}
}
