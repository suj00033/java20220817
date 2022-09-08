package ch11.lecture.p05class;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class C02Reflection {
	public static void main(String[] args) {
		Class c = String.class;
		
		Field[] fields = c.getFields();								// 필드타입 배열을 리턴
		
		for (Field field : fields) {
			System.out.println(field.getName());
		}
		
		System.out.println("메소드 목록");
		Method[] methods = c.getMethods();
		
		for (Method method : methods) {
			System.out.println(method.getName());
		}
		
		System.out.println("생성자 목록");
		Constructor[] constructors = c.getConstructors();
		
		for (Constructor constructor : constructors) {
			System.out.println(constructor.getName());
		}
	}
}
