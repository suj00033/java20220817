package ch14.book.s140601;

import java.util.function.IntBinaryOperator;

public class MethodReference {
	public static void main(String[] args) {
		IntBinaryOperator operator;
		
		// 정적 메소드 참조
		operator = (x, y) -> Calculator.staticMethod(x, y);				// 같은 파라미터를 사용했기 때문에
		System.out.println("결과1: " + operator.applyAsInt(1, 2));
		
		operator = Calculator :: staticMethod;							// 메소드 참조 사용가능
		System.out.println("결과2: " + operator.applyAsInt(3, 4));
		
		// 인스턴스 메소드 참조
		Calculator obj = new Calculator();
		operator = (x, y) -> obj.instanceMethod(x, y);
		System.out.println("결과3: " + operator.applyAsInt(5, 6));
		
		operator = obj :: instanceMethod;								// 객체명 :: 메소드명
		System.out.println("결과4: " + operator.applyAsInt(7, 8));
	}
}
