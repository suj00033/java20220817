package leetcode.java.home;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class M1512 {
		// 같은 숫자를 쌍으로 만들어내는 갯수를 구해라
	public int numIdenticalPairs(int[] nums) {
		return Arrays.stream(nums)
			 .boxed()
			 .collect(Collectors.groupingBy(e -> e, Collectors.counting()))				// 종료 연산
			 .values() 			// 값을 꺼내고
			 .stream()			// 스트림으로 변환
			 .mapToInt(n -> n.intValue())
			 .map(n -> n*(n-1)/2) // long연산
			 .sum();
			 
		// 풀이1
//	      int res = 0;
//	      Map<Integer, Integer> map = new HashMap<>();
//	        for(int n : nums) {
//	            map.put(n, map.getOrDefault(n, 0) + 1);
//	            res += map.get(n)-1;
//	        }
//	        return res;
	    }
	    
}

// getOrDefault 사용법: https://junghn.tistory.com/entry/JAVA-Map-getOrDefault-%EC%9D%B4%EB%9E%80-%EC%82%AC%EC%9A%A9%EB%B2%95-%EB%B0%8F-%EC%98%88%EC%A0%9C


// 풀이2
//public int numIdenticalPairs(int[] nums) {
//	Map<Integer, Integer> map = new HashMap<>();
//	for (int num : nums) {
//		if (map.containsKey(num)) {
//			// 이미 있었으면
//			Integer val = map.get(num);
//			map.put(num, val + 1);
//		} else {
//			// 처음
//			map.put(num, 1);
//		}
//	}
//
//	int result = 0;
//
//	for (Integer n : map.values()) {
//		Integer r = (n - 1) * n / 2;
//		result += r;
//	}
//
//	return result;