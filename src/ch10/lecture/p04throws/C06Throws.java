package ch10.lecture.p04throws;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class C06Throws {
	public static void main(String[] args) throws Throwable {		// 상위타입 익셉션보다 낮은 하위 익셉션은 쓰지 못한다.
		method1();
	}

	private static void method1() throws Throwable {		// 상위타입 익셉션을 사용해도 무방하지만 
		FileReader a = new FileReader("a");
		
	}
}
