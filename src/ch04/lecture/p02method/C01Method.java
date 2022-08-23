package ch04.lecture.p02method;

public class C01Method {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		
		// call method (invoke method) : 호출
		method1();							// 함수호출은 여러번 발생가능
		method1();
		
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		method2();
	}
	
		//	 메소드 (method)
	public static void method1() {        // 호출했을때 실행되는 부분
		System.out.println("a");
		System.out.println("b");
		System.out.println("c"); 
		
	}
	
	// method2 메소드 작성하고 main에서 method2를 호출하는 코드 작성
	
	public static void method2() {
		int sum = 0;
		
		int i = 1;
		
		while(i<=100) {
			sum+= i;
			i++;
		}
		
		System.out.println("1~" + (i-1) + " 합 : " + sum);
	}
}
