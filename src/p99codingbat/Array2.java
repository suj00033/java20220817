package p99codingbat;
//sameFirstLast
public class Array2 {
	public boolean sameFirstLast(int[] nums) {
		  if(nums.length>=1 && nums[0]==nums[nums.length-1]) {
		    return true;
	  } else {
		    return false;
		  }
		}
	
	
//	if (nums.length > 0) {
//	int first = nums[0];
//	int last = nums[nums.length - 1];
//	
//	return first == last;
//	}
//	return false;
}

