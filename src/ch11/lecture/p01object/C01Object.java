package ch11.lecture.p01object;

import java.util.Scanner;

public class C01Object {
	public static void main(String[] args) {
		// 모든 클래스의 상위 타입으로 모든걸 쓸수 있다.
		Object o1 = "top";
		Object o2 = new Scanner("gun");
		Object o3 = new ArrayIndexOutOfBoundsException();
		Object o4 = new int[] {3, 4, 5};
		Object o5 = new String[] {"red", "yellow", "gleen"};
		
		
		// 심지어 기본 타입 대입도 가능
		Object o6 = 3;  // int
		Object o7 = true;
		Object o8 = 3.14;
		
		Object[] o9 = {"goose", new int[] {3, 4}, new ArrayIndexOutOfBoundsException(), true};
		// 배열 안에 다 넣을수도 있음
	}
}
