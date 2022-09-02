package ch08.book.s080701;

public interface MyInterface {
	public void method1();
	
	public default void method2() {											// 디폴트
		System.out.println("MyInterface-method2 실행");	  					//  메소드  
	}
}
