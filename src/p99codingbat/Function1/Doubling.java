package p99codingbat.Function1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Doubling {
	public List<Integer> doubling(List<Integer> nums) {
		  return nums.stream()
		              .map(e -> e*2)
		              .collect(Collectors.toList());

//        풀이2
//		  List<Integer> res = new ArrayList<>();
//		  nums.forEach(e -> res.add(e*2));
//		  
//		  return res;	  
		}
}
