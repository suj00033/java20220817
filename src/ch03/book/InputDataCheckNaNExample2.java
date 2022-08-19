package ch03.book;

public class InputDataCheckNaNExample2 {
	public static void main(String[] args) {
		String usetInput = "NaN";
		double val = Double.valueOf(usetInput);
		
		double currentBalance = 10000.0;
		
		if(Double.isNaN(val)) {							// if Double.isNaN(val)를 활용하여 판단
			System.out.println("NaN이 입력되어 처리할 수 없음");
			val = 0.0;
			
			currentBalance += val;						// val은 NaN을 갖고있음, current = current + val;
			System.out.println(currentBalance);
		}
				
	}
}
