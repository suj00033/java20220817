package leetcode.java;

public class M1480 {
	public int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        
        res[0] = nums[0];	// res 배열0번째와 nums 배열0번째는 같다
        
        for (int i=1; i<nums.length; i++) {
        	res[i] = res[i-1] + nums[i];				// res 배열i번째
        	
// 			  int[] res = new int[nums.length];
//            
//            int sum = 0;
//            
//            for(int i=0; i<nums.length; i++) {
//                sum += nums[i];
//                res[i] = sum;
//            }
//            return res;									으로도 가능
        }
        return res;
	}
}
