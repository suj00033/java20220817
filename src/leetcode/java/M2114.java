package leetcode.java;

public class M2114 {
	public  int mostWordsFound(String[] sentences) {
		int max = 0;										// 변수 max를 선언한후 0으로 초기화	
		
		for(int i = 0; i<sentences.length; i++) {			// 0부터 sentences 길이 만큼 돌린다
			String[] str = sentences[i].split("\s");		// 문자배열 str 변수 선언하고 sentences의 i길이만큼 공백을 나눔
			max = Math.max(str.length, max);				// 변수 str의 길이에서 최대값을 구한다
		}
		return max;											// 최대값을 구하고 리턴
	}
}
