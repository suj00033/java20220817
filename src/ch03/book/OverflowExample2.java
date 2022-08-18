package ch03.book;

public class OverflowExample2 {
	public static void main(String[] args) {
		long x = 1000000;
		long y = 1000000;
		long z = x * y; // 오버플로우로 인해 long형을 쓴다
		System.out.println(z);
	}
}
