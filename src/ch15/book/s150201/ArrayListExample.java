package ch15.book.s150201;

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");			//0						// String 객체 저장
		list.add("JDBC");			//1
		list.add("Servlet/JSP");	//2 > 3번으로 밀려남
		list.add(2, "Database");	//2번으로 들어가고 
		list.add("iBATIS");
		
		int size = list.size();								// 저장된 총 객체 수 얻기
		System.out.println("총 객체수: " + size);
		System.out.println();
		
		String skill = list.get(2);							// 저장된 총 객체 수 만큼 루핑
		System.out.println("2: " + skill);					// 2번 인덱스 Database로 출력됨
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
		
		list.remove(2);											// 2번 인덱스 객체(Database) 삭제
		list.remove(2);											// 2번 인덱스 객체(Servlet/JSP) 삭제
		list.remove("iBATIS");
		
		for(int i=0; i<list.size(); i++) {						// 저장된 총 객체 수 만큼 루핑
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
	}
}




