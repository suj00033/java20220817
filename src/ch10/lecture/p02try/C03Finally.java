package ch10.lecture.p02try;

public class C03Finally {
	public static void main(String[] args) {
		try {
			int a = 3 / 1;
			
			if (a==1) {
				return;
			}
		} catch (ArithmeticException e) {
			System.out.println("exception!!!");
		} finally {
			System.out.println("@@@@@finally");						// 얘는 무조건 실행되는 코드
		}
		
		System.out.println("continus,,,,");							// if구문에서 return이 되었기 때문에 실행(x)
	}
}
