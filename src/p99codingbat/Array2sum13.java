package p99codingbat;

public class Array2sum13 {
	public int sum13(int[] nums) {
		int sum = 0;

		int before = 0;
		for (int num : nums) {
			if (num != 13 && before != 13) {
				sum += num;
			}
			before = num;
		}

		return sum;
	}
}
