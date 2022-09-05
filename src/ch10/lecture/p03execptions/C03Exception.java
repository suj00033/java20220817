package ch10.lecture.p03execptions;

public class C03Exception {
	public static void main(String[] args) {

		try {
			Class a = Class.forName("java.lang.String");
			System.out.println(a.toGenericString());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
