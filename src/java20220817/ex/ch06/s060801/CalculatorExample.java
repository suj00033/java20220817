package java20220817.ex.ch06.s060801;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int res1 = myCalc.plus(5,  6);
		System.out.println("result1: " + res1);
		
		byte x = 10;
		byte y = 4;
		double res2 = myCalc.divide(x, y);
		System.out.println("result2: " + res2);
		myCalc.powerOff();
		
	}
}
