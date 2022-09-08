package p99codingbat.Array1;
	// centeredAverage
public class Array2centerdAverage {
	public int centeredAverage(int[] nums) {
		  int max = Integer.MIN_VALUE;
		  int min = Integer.MAX_VALUE;
		  int sum = 0;
		  
		  // max, min, sum
		  for (int num : nums) {
		    max = Math.max(max, num);
		    min = Math.min(min, num);
		    sum += num;
		  }
		  
		  sum = sum - max - min;
		  
		  return sum / (nums.length - 2);
		}

}
