package ch05.lecture.p02reference;

public class C02Reference {
	public static void main(String[] args) {
		int[] a = {3, 4, 5};
		int[] b = {99, 100, 101};
		
		a[0] = 33;
		
		System.out.println(a[0]);
		
		int[] c = a;					// c라는 저장공간이 생기고, c공간에 a공간의 주소가 복사됨
		
		System.out.println(c[0]);
		
		c[2] = 1000;
		System.out.println(a[2]);
	}
}
