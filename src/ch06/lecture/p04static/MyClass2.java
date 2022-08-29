package ch06.lecture.p04static;

public class MyClass2 {
	// instance field
	String name;
	
	
	// static field
	static String company = "topgun";
	static int rank;
	
	static {					// 스태틱 필드에 연산이 필요할 경우에는 스태틱 블록을 생성하여 작성
		int a = 30;
		int b = 90;
		rank = a * b;
	}

	public MyClass2(String name) {
		this.name = name;
	}
}
