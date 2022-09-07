package ch11.lecture.p01object;

// extends Object 생략 가능
public class C03Equals extends Object {
	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book();
		
		System.out.println("Object equals()");
		System.out.println(b1.equals(b2));						// 같은 객체(참조값)이여야만 true가 나옴
		System.out.println(b2.equals(b1));						// 재정의가 되어 false나오던 부분이 true로 나옴
		System.out.println(b1.equals(b1));
		System.out.println(b2.equals(b2));
		
		Object b3 = new Book(333);
		Object b4 = new Book(333);
		
		System.out.println("Book equals()");
		System.out.println(b3.equals(b4));						// true
		System.out.println(b4.equals(b3));						// true
		
		Object b5 = new Book(777);
		System.out.println(b3.equals(b5));						// false
		System.out.println(b5.equals(b3));						// false
		
		System.out.println(System.identityHashCode(b3));
		System.out.println(System.identityHashCode(b4));
		System.out.println(System.identityHashCode(b5));
		
	}
}

class Book extends Object {
	private int code;
	
	Book() {						// 아규먼트 없는 생성자를 만들어줘야 new Book(); 오류가 안남
		
	}
	
	Book(int code) {
		this.code = code;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Book) {
			Book o = (Book) obj;
			
			if(obj != null) {						// obj가 null이 아닐때에만 실행
			return this.code == o.code;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return code * 3;
	}
}
