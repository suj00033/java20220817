package java20220817.ex.ch06.s060803;

public class Calculator {
	int plus(int x, int y) {
		int res = x + y;
		return res;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y);
		double res = sum / 2;
		return res;
	}
	
	void execute() {
		double res = avg(7, 10);
		println("실행결과: " + res);
	}
	
	void println(String message) {
		System.out.println(message);
	}
}
