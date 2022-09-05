package ch10.book.exercise.p06;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		String[] strArray = {"10", "2a"};							// strArray의 인덱스는 0, 1 > i가 2될때 초과됨
		int val = 0;
		for(int i=0; i<=2; i++) {
			try {
				val = Integer.parseInt(strArray[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스를 초과했음");			// 배열의 범위를 초과하여 실행
			} catch (NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음");		// 2a는 int형 변환 불가능이라 실행
			} finally {
				System.out.println(val);							// try 구문 안에서 실행되었기 때문에 여전히 val = 10 출력
			}														// value에 달리 할당된 값이 없다.
		}
	}
}
