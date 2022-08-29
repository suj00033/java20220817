package ch06.book.s060801;

public class ComputerExample {
	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		int[] values1 = {1, 2, 3};
		int res1 = myCom.sum1(values1);
		System.out.println("result1: " + res1);
		
		int res2 = myCom.sum1(new int[] {1, 2, 3, 4, 5});
		System.out.println("result2: " + res2);

		int res3 = myCom.sum2(1, 2, 3);
		System.out.println("result3: " + res3);

		int res4 = myCom.sum2(1, 2, 3, 4, 5);
		System.out.println("result4: " + res4);
		
		
	}
}
