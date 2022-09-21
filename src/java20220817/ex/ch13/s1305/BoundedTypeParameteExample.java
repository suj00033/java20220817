package java20220817.ex.ch13.s1305;

public class BoundedTypeParameteExample {
	public static void main(String[] args) {
		int res1 = Util.Compare(10, 20);
		System.out.println(res1);

		int res2 = Util.Compare(4.5, 3);
		System.out.println(res2);
	}
}
