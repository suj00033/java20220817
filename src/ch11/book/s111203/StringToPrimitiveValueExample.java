package ch11.book.s111203;

public class StringToPrimitiveValueExample {
	public static void main(String[] args) {
		int val1 = Integer.parseInt("10");
		double val2 = Double.parseDouble("3.14");
		boolean val3 = Boolean.parseBoolean("true");
		
		System.out.println("vlaue1: " + val1);
		System.out.println("vlaue2: " + val2);
		System.out.println("vlaue3: " + val3);
	}
}
