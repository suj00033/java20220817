package leetcode.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class M2089 {
	public List<Integer> targetIndices(int[] nums, int target) {
        // 정렬 이후 target 숫자 위치를 찾아라
        Arrays.sort(nums);
        
        List<Integer> list = new ArrayList<Integer>();
            for(int i=0; i<nums.length; i++) {
                if(target == nums[i]) 
                    list.add(i);
            }
                return list;
            
    }
	
//	int small = 0;
//    int big = 0;
//    
//    for (int num : nums) {
//        if (target > num) {
//            small++;
//        }
//        
//        if (target < num) {
//            big++;
//        }
//    }
//    
//    List<Integer> list = new ArrayList<>();
//    for (int i = small; i < nums.length - big; i++) {
//        list.add(i);
//    }
//    
//    return list;
//}
}

