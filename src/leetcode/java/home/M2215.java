package leetcode.java.home;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class M2215 {
	// 배열 안에서 2만큼 차이나는 쌍을 찾아라, num1과 num2 안에 중복되는 숫자를 제외하고.
	public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for (int num : nums1) {
            set1.add(num);
        }
        
        for (int num : nums2) {
            set2.add(num);
        }
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        
        for (Integer num : set1) {
            if (!set2.contains(num)) {
                list1.add(num);
            }
        }
        
        for (Integer num : set2) {
            if (!set1.contains(num)) {
                list2.add(num);
            }
        }
        
        result.add(list1);
        result.add(list2);
        
        return result;
    }
}
