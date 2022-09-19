package leetcode.java.home;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class M2206 {
	// 배열 안에서 같은 숫자를 묶어서 몇개의 쌍이 나오는 곳인가(n/2만큼의 개수를 만들수 있는가)
	public boolean divideArray(int[] nums) {
		 Set<Integer> set = new HashSet<>();
		        for(int i : nums){
		            if(set.contains(i)){
		                set.remove(i);
		            }else{
		                set.add(i);
		            }
		        }
		        return set.size() == 0;
		    }
		}


// 풀이2
//public boolean divideArray(int[] nums) {
//    Map<Integer, Integer> map = new HashMap<>();
//    
//    for (int num : nums) {
//        map.compute(num, (k, v) -> map.containsKey(k) ? v + 1 : 1);
//    }
//    
//    java.util.Collection<Integer> values = map.values();
//    
//    for (Integer value : values) {
//        if (value % 2 == 1) {
//            return false;
//        }
//    }
//    
//    return true;
//}
//}

// 풀이3
//HashMap<Integer, Integer> map = new HashMap();
//for(int n: nums)
//    map.put(n, map.getOrDefault(n, 0)+1);
//for(Map.Entry<Integer, Integer> entry: map.entrySet())
//    if(entry.getValue()%2!=0) return false;        
//
//return true;
//}
//}
