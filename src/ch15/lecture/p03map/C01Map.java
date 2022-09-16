package ch15.lecture.p03map;

import java.util.*;

public class C01Map {
	public static void main(String[] args) {
		// Map
		// (key, value) 쌍(entry)으로 저장
		// key는 중복될수 없음(x)
		// key는 하나의 value에 매핑됨
		
		Map<String, String> map = new HashMap<>();					// 별일없으면 HashMap 쓰기
		
		
		// entry 추가
		map.put("goose", "animal");
		map.put("iceman", "topgun");
		map.put("superman", "dc");
		map.put("captain", "marvel");
		map.put("goose", "dc");									// 이미 있는 키, 밸류 덮어씀
		map.put("cat", "animal");
		
		// entry 수 얻기
		int size = map.size();
		System.out.println(size);  							// 덮어쓴 키, 밸류는 하나로 침
		
		// 지우기
		map.remove("iceman");
		System.out.println(map.size());
		map.remove("coyote");								// 없는걸 지우면 개수 변화x
		System.out.println(map.size());
		
		// 이미 있는 키인가?
		boolean hasCat = map.containsKey("cat");
		System.out.println(hasCat);
		System.out.println(map.containsKey("goose"));
		
		// value 얻기
		String val1 = map.get("superman");
		System.out.println(val1);
		System.out.println(map.get("goose"));
		System.out.println(map.get("coyote"));
	}
}
