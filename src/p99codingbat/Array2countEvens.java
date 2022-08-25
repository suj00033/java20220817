package p99codingbat;

public class Array2countEvens {
	// countEvens
	public int countEvens(int[] nums) {
		  int cnt = 0;
		  
		  for (int num : nums) {
		    if((num % 2) == 0) {
		      cnt++;
		    }
		  }
		  
		  return cnt;
		}

}
