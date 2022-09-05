package ch10.book.s100402;

public class CatchOrderExample {
	public static void main(String[] args) {
		try {
			String data1 = args[0];								// 실행 매개값이 없음
			String data2 = args[1];
			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
			int res = val1 + val2;
			System.out.println(data1 + "+" + data2 + "=" + res);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");		// 첫 번째 캐치 블록 실행
		} catch(Exception e) {
			System.out.println("실행에 문제가 있습니다.");				// 그 밖의 예외 발생하여 두 번째 캐치 블록 실행
		} finally {
			System.out.println("다시 실행하세요.");						// 무조건 실행되는 finally 블록
		}
	}
}
