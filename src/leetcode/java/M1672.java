package leetcode.java;

public class M1672 {
	 public int maximumWealth(int[][] accounts) {
		 	
	        
	        int max = 0;
	        
	        for (int i=0; i<accounts.length; i++) {
	        	int sum = 0;
	        	for(int j=0; j<accounts[0].length; j++) {
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