package ch04.book;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		for (int m = 2; m <= 9; m++) {									// 앞자리
			System.out.println("*** " + m + "단 ***");
			for (int n = 1; n <= 9; n++) {								// 안쪽 뒷자리
				System.out.println(m + " x " + n + " = " + (m * n));
			}
		}
	}
}
