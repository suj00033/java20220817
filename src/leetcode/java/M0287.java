package leetcode.java;

import java.util.*;

public class M0287 {
	public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            if (!set.add(num)) {
                return num;
            }
        }
        
        return 0;
    }
}

