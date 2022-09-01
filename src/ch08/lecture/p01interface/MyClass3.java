package ch08.lecture.p01interface;

public class MyClass3 implements MyInterface3 { // 4개의 메소드를 재정의하거나 class앞에 abstract를 붙여야함
	@Override
	public void method1() {
		System.out.println("myclass3 method1");
		
	}

	@Override
	public void method2() {
		System.out.println("myclass3 method2");
		                           
	}                              
                                   
	@Override                      
	public void method3() {        
		System.out.println("myclass3 method3");
		                           
	}                              
                                   
	@Override                      
	public void method4() {        
		System.out.println("myclass3 method4");
		
	}

}

