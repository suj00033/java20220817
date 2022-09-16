package leetcode.java;

import java.util.*;

public class M1684 {
	public int countConsistentStrings(String allowed, String[] words) {
		
	// Set으로 풀기	
	 Set<Character> set = new HashSet<>();
     
     for(int i=0; i<allowed.length(); i++) {
         set.add(allowed.charAt(i));             // allowed가 가지고 있는 i를 추가
     }
     
     int cnt = 0;
     for(String word : words) {         // 각 문자열에 set이 있는지 확인해야함
         
        int i=0;
         for(; i<word.length(); i++) { // word의 문자가 set에 모두 있는가? 하나라도 없으면 count하지않는다
             if(!set.contains(word.charAt(i))) {
              break;
             }
         }
         if(i == word.length()) {
             cnt++;
         }
     }
     return cnt;
}

}
	 

		 
//		 // 정규표현식으로 품
//		 	String pattern = "[" + allowed + "]+";
//	        
//	        int cnt = 0;
//	        
//	        for (String word : words) {
//	            if(word.matches(pattern)) {
//	                cnt++;
//	            }
//	        }
//	    return cnt;
//	    }
	 
	 
//	        int cnt = 0;
//	        for (String word : words) {				// for(자료형 변수명 : 배열명)
//	            if (consistOf(allowed, word)) {
//	                cnt++;
//	            }
//	        }
//	        
//	        return cnt;
//	    }
//	    
//	    private boolean consistOf(String allowed, String word) {
//	        for (int i = 0; i < word.length(); i++) {
//	            if (!hasChar(allowed, word.charAt(i))) {
//	                return false;
//	            }
//	        }
//	        
//	        return true;
//	    }
//	    
//	    private boolean hasChar(String allowed, char c) {
//	        for (int i = 0; i < allowed.length(); i++) {
//	            if (allowed.charAt(i) == c) {
//	               return true; 
//	            }
//	            
//	        }
//	        
//	        return false;
//	    }
//	}
	 

