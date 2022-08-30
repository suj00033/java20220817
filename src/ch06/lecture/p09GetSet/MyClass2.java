package ch06.lecture.p09GetSet;

public class MyClass2 {
	// 필드는 특별한 이유가 없으면 private
	private String name;
	private int age;
	
	
	
	// 대신 getter, setter method 공개(public)
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
