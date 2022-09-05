package ch10.book.s100201;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		String data = null;
		
		System.out.println(data.toString());	// data 변수는 null값을 가지고 있어 객체를 참조하고 있지않음
	}
}
