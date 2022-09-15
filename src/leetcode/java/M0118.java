package leetcode.java;

import java.util.ArrayList;
import java.util.List;

public class M0118 {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> firstRow = new ArrayList<>();
		firstRow.add(1);

		list.add(firstRow);

		for (int i = 1; i < numRows; i++) {						// 전체줄
			List<Integer> next = new ArrayList<>();
			List<Integer> current = list.get(list.size() - 1);

			next.add(1);										// 맨 앞자리 아이템 1
			for (int j = 1; j < current.size(); j++) {			// 전줄
				next.add(current.get(j) + current.get(j - 1));
			}
			next.add(1);										// 맨 뒷자리 아이템 1

			list.add(next);
		}
		return list;
	}
}
