package leetcode.java;

public class M1929 {
	public int[] getConcatenation(int[] nums) {
		int[] res = new int[nums.length * 2];

		for (int i = 0; i < nums.length; i++) {
			res[i] = nums[i];
			res[i + nums.length] = nums[i];

			/*
			 * java.util.Arrays.setAll(res, (i) -> nums[i%nums.length]); 
			 * return res;     으로도 압축가능
			 */							
		}
		return res;
	}
}
