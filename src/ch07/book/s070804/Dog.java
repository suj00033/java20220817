package ch07.book.s070804;

public class Dog extends Animal {
	public Dog() {
		this.kind = "포유류";
	}
	
	@Override							// 추상 메소드 재정의
	public void sound() {
		System.out.println("멍멍");
	}
}
