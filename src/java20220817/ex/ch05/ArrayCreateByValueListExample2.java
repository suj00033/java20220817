package java20220817.ex.ch05;

public class ArrayCreateByValueListExample2 {
	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83, 90, 87};
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 =+ scores[i];
		}
		System.out.println("총합 : " + sum1);
		
	}
}
