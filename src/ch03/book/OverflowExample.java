package ch03.book;

public class OverflowExample {
	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z = x * y; // 오버플로우 발생
		System.out.println(z);
	}
}
