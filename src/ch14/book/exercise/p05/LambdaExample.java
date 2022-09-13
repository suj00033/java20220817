package ch14.book.exercise.p05;

import java.util.function.IntBinaryOperator;

public class LambdaExample {
	private static int[] scores = { 10, 50, 3 };
	
	public static int maxOrMin(IntBinaryOperator operator) {
		int res = scores[0];
		for(int score : scores) {
			res = operator.applyAsInt(res, score);
		}
		return res;
	}
	
	public static void main(String[] args) {
		// 최대값 얻기
		int max = maxOrMin(
				(a, b) -> {
					if(a>=b) return a;
					else return b;
				}
				);
		System.out.println("최대값: " + max);
		
		// 최소값 얻기
		int min = maxOrMin(
				(a, b) -> {
					if(a<=b) return a;
					else return b;
				}
				);
		System.out.println("최소값: " + min);
	}
}
