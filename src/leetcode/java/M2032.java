package leetcode.java;

import java.util.*;

public class M2032 {
	public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
		// Integer 배열 3개
		// 3개의 배열에서 적어도 2개가 같은 숫자가 있으면 리턴
		
		// 첫번째 풀이코드
//		Set<Integer> set = new HashSet<>(), set1 = new HashSet<>(), set2 = new HashSet<>(), set3 = new HashSet<>();
//					// 이미 있는 3개 배열을
//					// set에 집어넣음
//					// 이미 있는 배열들은 false나옴
//		for (int num : nums1) {
//			set1.add(num);
//			set.add(num);
//		}
//		for (int num : nums2) {
//			set2.add(num);
//			set.add(num);
//		}
//		for (int num : nums3) {
//			set3.add(num);
//			set.add(num);
//		}

//		List<Integer> result = new ArrayList<>();
//		for (int i : set)
//			if (set1.contains(i) && set2.contains(i) || set2.contains(i) && set3.contains(i)
//					|| set1.contains(i) && set3.contains(i))
//				result.add(i);
//		return result;
		
		
		// 두번째 풀이코드
		Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        
        for (int num : nums1) {						// 중복된 숫자 제거
            set1.add(num);
        }
        
        for (int num : nums2) {
            set2.add(num);
        }
        
        for (int num : nums3) {
            set3.add(num);
        }
        
        Set<Integer> all = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        
        for (Integer num : set1) {
            all.add(num);
        }
        
        for (Integer num : set2) {
            if (!all.add(num)) {
                res.add(num);
            }
        }
        
        for (Integer num : set3) {
            if (!all.add(num)) {
                res.add(num);
            }
        }
        
        return new ArrayList<Integer>(res);
		
	}
}