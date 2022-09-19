package leetcode.java.home;

import java.util.HashMap;
import java.util.Map;

public class M2006 {
	// 배열에서 k숫자만큼 차이나는 쌍이 몇개인가
	public int countKDifference(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int res = 0;
        
        for(int i = 0;i< nums.length;i++){
            if(map.containsKey(nums[i]-k)){
                res+= map.get(nums[i]-k);
            }
            if(map.containsKey(nums[i]+k)){
                res+= map.get(nums[i]+k);
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        
        return res;
    }
}

// 풀이2
//Map<Integer, Integer> map = new HashMap<>();
//
//for(int n : nums) {
//    map.computeIfPresent(num, (key, val) -> val + 1);
//    map.computeIfAbsent(num, (key) -> 1);
//}
//
//System.out.println(map);
//
//int res = 0;
//
//for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
//    Integer Key = entry.getKey();
//    Integer target1 = key - k;
//    Integer taeget2 = key + k;
//    
//    Integer val = entry.getValue();
//    Integer targetVal1 = map.get(target1);
//    Integer targetVal2 = map.get(target2);
//    
//    if(targetVal1 != null) {
//        res += val * targetVal1;
//    }
//    if(targetVal2!= null) {
//        res += val * targetVal2;
//    
//}
//}
//
//result /= 2;
//
//return result;
//}
//}
