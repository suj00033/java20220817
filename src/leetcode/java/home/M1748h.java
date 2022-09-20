package leetcode.java.home;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class M1748h {
//	// 배열에 숫자 한개씩만 있는 아이템들을 더해라
	public int sumOfUnique(int[] nums) {
		return Arrays.stream(nums)
			.boxed()
			.collect(Collectors.groupingBy(e -> e, Collectors.counting())) 				// 카운팅 맵 만들기, 종료연산
			.entrySet()								// map에는 string으로 바꾸는 기능이 없기 때문에
			.stream()								// entrySet을 통해 map을 set으로 바꿈*Set에는 string 바꾸는 기능이 있음
			.filter(e -> e.getValue() == 1)			// 이후 stream으로 반복처리
			.mapToInt(e -> e.getKey())				// mapxxx은 xxx타입으로 바꿔준다
			.sum();
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//        // key : number
//        // value : 몇개
//        Map<Integer, Integer> map = new HashMap<>();
//        
//        for (int num : nums) {
//            if (map.containsKey(num)) {
//                // map에 있으면
//                int val = map.get(num);
//                val++;
//                
//                map.put(num, val);
//            } else {
//                // map에 없으면
//                map.put(num, 1);
//            }
//        }
//        
//        int sum = 0;
//        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
//        for (Map.Entry<Integer, Integer> entry : entries) {
//            if (entry.getValue() == 1) {
//                sum += entry.getKey();
//            }
//        }
//        
//        return sum;
    // 풀이2
	
}
}