package ch10.lecture.p02try;

public class C05Catch {
	public static void main(String[] args) {
		String[] arr = { "100", "2", "삼백" };

		try {
			int a = Integer.parseInt(arr[3]); 					// arr[0] = 100

			System.out.println(a * 2);
		} catch (ArrayIndexOutOfBoundsException e) {			// catch 블럭 여러개 작성가능
			System.out.println("인덱스 잘못 작성");
		} catch (NumberFormatException e) {
			System.out.println("수의 형식이 잘못됨");
		}

		System.out.println("실행 흐름 이어감");
	}
}
