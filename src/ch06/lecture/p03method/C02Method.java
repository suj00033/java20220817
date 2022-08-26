package ch06.lecture.p03method;

public class C02Method {
	public static void main(String[] args) {
		MyClass2 o1 = new MyClass2("Jack");
		MyClass2 o2 = new MyClass2("IU");
		
		o1.printName();						// 인스턴스 기능
		o2.printName();						// instance method
	}
}
