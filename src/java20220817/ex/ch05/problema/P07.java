package java20220817.ex.ch05.problema;

public class P07 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };
		
		for(int i=0; i<array.length; i++) {
			if(array[i] > max) {			// max의 값보다 array[i]이 크면
				max = array[i];				// max = array[i]
			}
		}
		
		
		System.out.println("max: " + max);
	}
}
