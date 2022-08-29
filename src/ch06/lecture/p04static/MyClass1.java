package ch06.lecture.p04static;

public class MyClass1 {
		// non static field
		// instance field
		String name;
		
		// static field
		// class field
		static String company;
		
		// 생성자 constructor
		public MyClass1(String name) {
			this.name = name;
		}
		
		// non static method
		// (instance) method
		void printName() {
			System.out.println(name);
		}
		
		// static method
		// class method
		static void printCompany() {
			System.out.println(company);
	}
	
}

//	// 필드 non static 
//	String	name;
//	
//	// 필드 static field
//	// class field : 클래스 자체에 이름을 붙이고 싶을때 사용
//	static String company;
//	
//	// 생성자
//	public MyClass1(String name) {
//		this.name = name;
//	}
//	
//	// 메소드 non static
//	void printName() {
//		System.out.println(name);
//	
//	// static method
//	static void printCompany() {
//		System.out.println(company);