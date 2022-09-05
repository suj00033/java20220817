package ch10.book.exercise.p05;

public class P5 {
	public void method1() throws NumberFormatException, ClassNotFoundException {
		
	}
	
	// 보기1
	public void method2() {
		try {
			method1();
		} catch (Exception e) {
			
		}
	}
	
	
	// 보기2
	public void method3() throws Exception {
		method1();
	}
	
	// 보기4 : 순서 상관없다
	public void method5() {
		try {
			method1();
		} catch (NumberFormatException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
