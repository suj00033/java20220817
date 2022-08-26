package ch06.book.s060804;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCalcu = new Calculator();
		
		// 정사각형의 넓이 구하기
		double res1 = myCalcu.areaRectangle(10);
		
		// 직사각형의 넓이 구하기
		double res2 = myCalcu.areaRectangle(10, 20);
		
		// 결과 출력
		System.out.println("정사각형 넓이=" + res1);
		System.out.println("직사각형 넓이=" + res2);
	}
}
