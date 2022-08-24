package ch05.book;

import java.util.Arrays;								

public class ArrayInArrayExample {
	public static void main(String[] args) {
		
		int[][] mathScores = new int[2][3];				// 아이템 2개, 길이는 3
		for(int i=0; i<mathScores.length; i++) {
			for(int k=0; k<mathScores[i].length; k++) {
				System.out.println("mathScores["+i+"]["+k+"]="+mathScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] englishScores = new int[2][];		// 아이템 2개, 길이는 안정함
		englishScores[0] = new int[2];				// 0번덱스에는 Integer 2개 담을 수 있는 길이배열 할당
		englishScores[1] = new int[3];				// 1번덱스에는 3길이배열 할당
		for(int i=0; i<englishScores.length; i++) {
			for(int k=0; k<englishScores[i].length; k++) {
				System.out.println("englishScores["+i+"]["+k+"]="+englishScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] javaScores = {{95,80}, {92,96,80}};
		for(int i=0; i<javaScores.length; i++) {
			for(int k=0; k<javaScores[i].length; k++) {
				System.out.println("javaScores["+i+"]["+k+"]="+javaScores[i][k]);
			}
		}
		
		// for문 없이 배열 item 출력
		int[] a = {2, 3, 4, 5};
		System.out.println(Arrays.toString(a));
		
		System.out.println(Arrays.toString(javaScores));
		System.out.println(Arrays.toString(javaScores[0]));
		System.out.println(Arrays.toString(javaScores[1]));
		
		System.out.println(Arrays.deepToString(javaScores));
	}
}
