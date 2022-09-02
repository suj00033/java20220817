package ch09.lecture.p02lambda;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;

public class MyClass5 {
	public static void main(String[] args) {
		IntConsumer o1 = (int v) -> System.out.println(v*v); 			// 파라미터 1개 받음
		o1.accept(3); 	// 9											// IntConsumer의 추상 메소드는 1개, accept();
		o1.accept(4);	// 16
		o1.accept(10);	// 100
		
		System.out.println();
		
		DoubleConsumer o2 = (double a) -> System.out.println(a/2);		// functional Interface: IntConsumer, DoubleConsumer
		o2.accept(5); 	// 2.5
		o2.accept(10); 	// 5.0
		o2.accept(7); 	// 3.5
		
	}
}


