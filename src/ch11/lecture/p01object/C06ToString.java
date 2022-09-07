package ch11.lecture.p01object;

public class C06ToString {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		
		System.out.println(o1.toString());				// 왼쪽에는 클래스@오른쪽에는 해시코드
		System.out.println(o2.toString());
		
		Object o3 = new Book(300);
		Object o4 = new Book(400);
		
		System.out.println(o3.toString());
		System.out.println(o4.toString());
		
		Object o5 = new String("java");
		Object o6 = new String("java");
		
		System.out.println(o5.toString());				// 재정의했기때문에 클래스@해시코드가 안나옴(자기자신이라서)
		System.out.println(o6.toString());
	}
}
