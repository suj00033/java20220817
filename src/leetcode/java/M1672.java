package leetcode.java;

public class M1672 {
	 public int maximumWealth(int[][] accounts) {
		 	
	        
	        int max = 0;
	        
	        for (int i=0; i<accounts.length; i++) {
	        	int sum = 0;
	        	for(int j=0; j<accounts[i].length; j++) {
	        		sum += accounts[i][j];
	        		
	        		max = Math.max(max, sum);
	        	}
	        }
	        return max;
	    }
}
//int m = accounts.length;
//int n = accounts[0].length;
//int output = 0;
//
//for(int i=0; i<m; i++) {
//	int tmp = 0;
//
//	for(int j=0; j<n; j++) 
//		tmp += accounts[i][j];
//
//	output = Math.max(output, tmp);
//}
//
//return output;
//}
//}

class Solution {
    public int maximumWealth(int[][] accounts) {					// 2차배열
        int sum = 0;
        int max = 0;
        for(int i = 0; i < accounts.length; i++){
            for(int j = 0; j < accounts[i].length; j++){
                sum = sum + accounts[i][j];
            }
            if(sum > max){
                max = sum;
            }
            sum = 0;
        }
        return max;
    }
}