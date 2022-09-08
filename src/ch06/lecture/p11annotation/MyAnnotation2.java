package ch06.lecture.p11annotation;

import ch05.book.s050701.Week;

public @interface MyAnnotation2 {		// 부가적인 정보
	String value() default ""; 					// element(attribute)
	int age() default 0;						// default를 통해 오류를 제거				
	
	
Week week() default Week.MONDAY;
	
	String[] names() default {};
}
