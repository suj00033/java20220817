package ch10.book.s100401;

public class CatchByExceptionKindExample {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
			int res = val1 + val2;
			System.out.println(data1 + "+" + data2 + "=" + res);
		} catch(ArrayIndexOutOfBoundsException e) {							// 6,7 라인 오류 발생시 실행
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java CatchByExceptionKindExample  num1  mum2");
		} catch(NumberFormatException e) {									// 8,9 라인 오류 발생시 실행
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {															// 무조건 실행
			System.out.println("다시 실행하세요.");
		}
	}
}
