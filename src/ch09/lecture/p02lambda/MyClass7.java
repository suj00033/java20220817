package ch09.lecture.p02lambda;

public class MyClass7 {
	public static void main(String[] args) {
		MyInterface7 o1 = n -> n*2;
		int x = o1.method(9);
		System.out.println(x);
		
		MyInterface7 o2 = i -> i*i;
		
		int y = o2.method(10);
		System.out.println(y);
	}
}

@FunctionalInterface    			// 1개의 메소드를 갖고있는지 검사해준다
interface MyInterface7 {
	int method(int i);
//	int method3(int i);
}