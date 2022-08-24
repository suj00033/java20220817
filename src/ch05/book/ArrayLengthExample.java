package ch05.book;

public class ArrayLengthExample {
	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		
		int sum = 0;
		for(int i = 0; i<scores.length; i++) {					//	scores.length => 3
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);

		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
	}
}
