package ch06.lecture.p02constructor;

public class C03Constructor {
	public static void main(String[] args) {
		MyClass3 o1 = new MyClass3("iceman", 77);
		System.out.println(o1.name);
		System.out.println(o1.age);
		
		MyClass3 o2 = new MyClass3("maverick", 80);
		System.out.println(o2.name);
		System.out.println(o2.age);
		
//		MyClass3 o3 = new MyClass3();          실행x
	}
}
