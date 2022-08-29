package ch06.lecture.p07accessModifier.package1;

public class MyClass1 {
	// 필드
	// 접근 제한자 생략하면 같은 패키지 내에서 사용 가능
	// package private(default) 패키지 내에서만 프라이빗하게 쓰임
	String name;
	
	// public : 다른 패키지에서도 사용 가능
	public int age;
	
	// private : 클래스 내에서만 사용가능(같은 패키지에서도 사용 불가능)
	private String secret;
	
	
	// 생성자
	
	
	
	// 메소드
	// 접근 제한자 생략하면 같은 패키지 내에서 사용 가능
	void printName() {
		System.out.println(name);
	}
	
	public void printAge() {          // public : 다른 패키지에서도 사용 가능
		System.out.println(age);
	}
	
	public void serSecret(String secret) {
		this.secret = secret;			// 같은 클래스가 있어 secret 사용 가능
	}
	
	public void printSecret() {
		System.out.println(secret);
	}
}
