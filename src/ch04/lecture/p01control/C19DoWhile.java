package ch04.lecture.p01control;

public class C19DoWhile {
	public static void main(String[] args) {
		
		System.out.println(1);
		
		do {
		System.out.println(2);
		System.out.println(3);
		} while (false);			// true일 경우에는 3에서 다시 2로 가기때문에 4가 필요없어짐
		
		System.out.println(4);
	}
}
