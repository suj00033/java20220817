package leetcode.java;

public class M1684 {
	 public int countConsistentStrings(String allowed, String[] words) {
	        int cnt = 0;
	        for (String word : words) {				// for(자료형 변수명 : 배열명)
	            if (consistOf(allowed, word)) {
	                cnt++;
	            }
	        }
	        
	        return cnt;
	    }
	    
	    private boolean consistOf(String allowed, String word) {
	        for (int i = 0; i < word.length(); i++) {
	            if (!hasChar(allowed, word.charAt(i))) {
	                return false;
	            }
	        }
	        
	        return true;
	    }
	    
	    private boolean hasChar(String allowed, char c) {
	        for (int i = 0; i < allowed.length(); i++) {
	            if (allowed.charAt(i) == c) {
	               return true; 
	            }
	            
	        }
	        
	        return false;
	    }
	}

