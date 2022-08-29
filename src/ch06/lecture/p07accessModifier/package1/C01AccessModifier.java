package ch06.lecture.p07accessModifier.package1;

public class C01AccessModifier {
	public static void main(String[] args) {
		MyClass1 o1 = new MyClass1();
		o1.name = "coyote";
		o1.printName();
		
		o1.age = 99;
		o1.printAge();
		
//		o1.secret = "my secret";     // private 멤버는 같은 패키지여도 사용 불가능(같은 클래스에서만 사용)
		o1.serSecret("my secret");   // MyClass1에서 30줄째를 통해 접근 가능
		o1.printSecret();
	}
}
