package ch06.lecture.p04static;

public class MyClass3 {
	// instance field
	String name;
	
	// static field
	static String company = "topgun";
	
	public MyClass3(String name) {
		this.name = name;
	}
	
	
	// instance method
	void printName() {
		System.out.println(this.name);
	}
}

// static 멤버에서는 instance 멤버에 접근이 불가능하다
// instance 멤버에서는 static 멤버로는 접근이 가능하다
// this는 instance 멤버 접근시 사용 가능하다