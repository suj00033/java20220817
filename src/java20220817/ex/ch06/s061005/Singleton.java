package java20220817.ex.ch06.s061005;

public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	static Singleton getIstance() {
		return singleton;
	}
}
