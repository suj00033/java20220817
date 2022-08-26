package ch06.lecture.p03method;

public class C03Parameter {
	public static void main(String[] args) {
		MyClass3 o1 = new MyClass3();
		
		o1.method1();     // 파라미터가 없기 때문에 값을 못줌
		o1.method2(3);
		o1.method3(4, 23);
		o1.method4("Kack", 66);
		o1.method5("Hi", "LOOL");
		o1.method6("hello");
		
		o1.method6();
		o1.method6("uj");  // 대입된 값에 따라 알아서 형태에 맞춰 호출됨
		o1.method6("kiki", "ioio");
		
		
	}
}
