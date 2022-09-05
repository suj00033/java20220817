package ch10.book.s100403;

public class MultiCatchExample {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
			int res = val1 + val2;
			System.out.println(data1 + "+" + data2 + "=" + res);
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {		// 공통된 상위인셉션을 쓸수도 있다
			// catch (RuntimeException e) {  											으로도 가능
			System.out.println("실행 매개값의 수가 부족하거나 숫자로 변환할 수 없습니다.");
		} catch (Exception e) {
			System.out.println("알 수 없는 예외 발생");
		} finally {
			System.out.println("다시 실행하세요.");						// 무조건 실행
		}
	}
}
