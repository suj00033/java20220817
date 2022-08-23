package ch04.lecture.p01control;

public class C10For {
	public static void main(String[] args) {
		System.out.println("===============================");
		System.out.println("-------------------------------");
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

		int k = 0; // 새로운 변수 k 선언
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) { // 4번
				System.out.print(k);
				k++;
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

		for (int i = 0; i < 5; i++) { // 위에서부터 스페이스 0개부터 1개씩 늘어감
			// 스페이스 출력
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			// * 출력 5번 출력해야함
			for (int q = 5; q > i; q--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("===============================");

		for (int i = 0; i < 5; i++) { // 5줄 출력
			// 스페이스 출력 0일때 스페이스 4번
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			// * 출력
			for (int l = 0; i >= l; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("===============================");

		// 0
		// 12
		// 345
		// 6789
		// 01234

		int x = 0; 							// 새로운 변수 k 선언
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) { // 4번
				System.out.print((x++) % 10);
			}
			System.out.println();
		}
	}
}
