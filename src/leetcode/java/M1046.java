package leetcode.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class M1046 {
	public int lastStoneWeight(int[] stones) {
        // 돌들의 무게, 가장 무거운 돌들을 부딪혀 큰 무게-작은 무게=남은 무게, 똑같은 무게 돌들은 사라짐 > 
        // 결국 하나 남은 돌의 무게가 무엇인가
        // 돌이 하나도 남지않았을때는 0으로 리턴
        
        List<Integer> list = new ArrayList<>();
        for (int stone : stones) {
            list.add(stone);
        }
        
        while(list.size()>1) {                      					// 하나 남을때까지
            list.sort(Comparator.naturalOrder());   					// 정렬해서
            Integer big1 = list.remove(list.size() - 1); 				// 맨 뒤에 두개 꺼내서, 마지막 아이템 꺼내기 -1
            Integer big2 = list.remove(list.size() - 1);
            Integer diff = big1 - big2;             					// 부딪히고
            
            if(diff!=0) {												// 부딪혀서 남은 무게가 0이 아닐때
                list.add(diff);                   					    // 남은 거 다시 추가
            }
        }
        
        return list.isEmpty() ? 0 : list.get(0);
        
//        if(list.isEmpty()) {											// 뒤에 더 남은 것이 있는지 검토
//            return 0;
//        } else {
//            return list.get(0);
//        }
       
    }
}

