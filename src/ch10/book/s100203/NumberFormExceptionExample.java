package ch10.book.s100203;

public class NumberFormExceptionExample {
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";								//a100 문자열은 숫자로 변환 불가능하기에 오류가 발생
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);				// 오류 발생
		
		int res = value1 + value2;
		System.out.println(data1 + "+" + data2 + "=" + res);
		
		
	}
}
