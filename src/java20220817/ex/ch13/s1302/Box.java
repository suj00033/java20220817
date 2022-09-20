package java20220817.ex.ch13.s1302;

public class Box<T> {
	private T t;
	
	public T get() { 
		return t;
	}
	
	public void set(T t) { 
		this.t = t;
	}
}
