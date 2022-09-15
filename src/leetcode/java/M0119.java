package leetcode.java;

import java.util.ArrayList;
import java.util.List;

public class M0119 {
	public List<Integer> getRow(int rowIndex) {
		
		List<Integer> row = new ArrayList<>();
		row.add(1);

		// 다음 줄 만들기
		for (int i = 0; i < rowIndex; i++) {
			List<Integer> next = new ArrayList<>();

			next.add(1); 									// 맨 앞자리 아이템 1
			for (int j = 1; j < row.size(); j++) {
				next.add(row.get(j) + row.get(j - 1));
			}
			next.add(1);									// 맨 뒷자리 아이템 1

			row = next;
		}

		return row;
	}
}

