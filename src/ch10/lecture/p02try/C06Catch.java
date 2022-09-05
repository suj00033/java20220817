package ch10.lecture.p02try;

public class C06Catch {
	public static void main(String[] args) {
		try {
			int a = 3 / 0;
		} catch(RuntimeException e) {				// ArithmeticException이 하위이기 때문에 상위(Throwable) 카테고리 써도 무방
			System.out.println("0으로 나눌 수 없다.");
		}
	}
}
