package java20220817.ex.ch15;


public class UId {
	public static void main(String[] args) {
		String s1 = "spring";
		String s2 = "sp";
		s2 += "ring";
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}
