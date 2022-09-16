package leetcode.java;

import java.util.*;

public class M0771 {
	public int numJewelsInStones(String jewels, String stones) {
	     Set<Character> set = new HashSet<>(); 
	 	        for(int i=0; i<jewels.length(); i++) {      // jewels 해시셋 만들기
	            set.add(jewels.charAt(i));					// charAt 문자꺼내기
	        }
	        
	        int cnt = 0;
	        for(int i=0; i<stones.length(); i++) {     		// stones에서 jewels 찾아서
	            if(set.contains(stones.charAt(i))) {		// stones에 i라는 문자가 있으면
	                  cnt++;                       		    // 카운트
	            }
	        }
	       return cnt; 
	    }
}
