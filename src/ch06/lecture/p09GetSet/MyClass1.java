package ch06.lecture.p09GetSet;

public class MyClass1 {
	private int age;
	
	// getter (읽기)
	public int getAge() {
		return age;
	}
	
	// setter (쓰기)
	public void setAge(int age) {
		if (age >= 0) {
			this.age = age;
		}
	}
}
