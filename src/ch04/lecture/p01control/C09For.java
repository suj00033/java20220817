package ch04.lecture.p01control;

public class C09For {
	public static void main(String[] args) {
		System.out.println("===============================");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("===============================");

		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("===============================");

		for (int i = 5; i > 0; i--) {
			for (int j = 5; j > 0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("===============================");

		for (int i = 4; i >= 0; i--) {
			for (int j = 4; j >= 0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("===============================");

		for (int i = 0; i <= 4; i++) {
			for (int j = 0; i >= j; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("===============================");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; i >= j; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("===============================");

		for (int i = 1; i <= 4; i++) {
			for (int j = 0; j <= 9; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("===============================");

		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("===============================");

		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("===============================");
		

	}
}
