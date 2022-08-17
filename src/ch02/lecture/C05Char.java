package ch02.lecture;

public class C05Char {
	public static void main(String[] args) {
		// char : 2bytes
		// 하나의 문자 표현용
		// 음수라는 개념이 없다
        // unicode 사용
		
		char a;
		a = '가'; // 문자 하나는 작은 따옴표 사용
		
		char b = 'A';
		char c = 'a';
		char d = ' ';
//		char e = '';    // 빈문자는 없음 (but 빈 문자열은 있음)
		String f = ""; // 얘는 가능함
		
		char h = 44941;
		System.out.println(h); //ASCII 코드
		char g = 65;
		System.out.println(g);
		char i = 0xAF8D;
		System.out.println(i);
		char j = '\uAF8D';
		System.out.println(j);
		char k = '\u270d';
		System.out.println(k);
	}
}
