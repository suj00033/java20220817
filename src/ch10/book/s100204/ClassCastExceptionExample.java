package ch10.book.s100204;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();				
		changeDog(cat);									// Cat 객체를 매개값으로 주었기 때문에 Dog타입으로 변환 불가능하여
	}													// 12라인에서 오류가 발생
	
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
			Dog dog = (Dog) animal;						// 오류 발생 가능
		}												// 이에 13~15라인을 주석을 이용하여 타입 체크를 먼저 하자
	}
}

class Animal {}
class Dog extends Animal{}							
class Cat extends Animal{}

