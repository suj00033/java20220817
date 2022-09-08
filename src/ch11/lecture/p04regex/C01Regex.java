package ch11.lecture.p04regex;

public class C01Regex {
	public static void main(String[] args) {
		// regular expression(regex)
		// 정규표현식, 정규표현
		// 문자열의 패턴을 표현하는 코드(문자열)
		
		String str1 = "a";
		
		// 하나의 문자
		String pattern1 = "a";
		
		System.out.println(str1.matches(pattern1));
		
		String s2 = "b";
		String p2 = "b";
		System.out.println(s2.matches(p2));
		
		String s3 = "bb";
		String p3 = "b";
		System.out.println(s3.matches(p3));
		
		String s4 = "bbb";
		String p4 = "b+";						// + : '1개 이상'이라는 의미
		System.out.println(s4.matches(p4));		// b가 여러개라는 의미로 상통하여
		System.out.println(s3.matches(p4));		// true로 출력
		System.out.println(s2.matches(p4));
		
		System.out.println("".matches(p4));
		
		String p5 = "b*";						// * : '0개 이상'
		System.out.println("bbb".matches(p5));
		System.out.println("bb".matches(p5));
		System.out.println("b".matches(p5));
		System.out.println("".matches(p5));		// 0개 이상이므로 true로 출력
		
		String p6 = "dog";
		System.out.println("dog".matches(p6));
		
		String p7 = "do+g";
		System.out.println("dog".matches(p7));
		System.out.println("doooooooog".matches(p7));
		
		String p8 = "[abcd]";					// [] : 안에 나열된 문자 중에 하나
		System.out.println("a".matches(p8));
		System.out.println("b".matches(p8));
		System.out.println("c".matches(p8));
		System.out.println("e".matches(p8));
		System.out.println("A".matches(p8));	// 대소문자 구분 있어야함, false
		
		String p9 = "[a-c]";
		System.out.println("a".matches(p9));
		System.out.println("b".matches(p9));
		System.out.println("c".matches(p9));
		System.out.println("A".matches(p9));
		System.out.println("e".matches(p9));
		
		String p10 = "[a-cA-C]";				// [abcAbc]라는 뜻
		System.out.println("a".matches(p10));
		System.out.println("A".matches(p10));
		System.out.println("d".matches(p10));
		System.out.println("abc".matches(p10)); // 문자열 하나를 뜻하는 것으로 abc는 아니다
		
		System.out.println("abc".matches("[a-c]+"));	// abc 중에 하나 이상
		
		String p11 = "[^abcdefghijkl]";					// [^] : 제외하고
		System.out.println("a".matches(p11));
		System.out.println("m".matches(p11));
		System.out.println("0".matches(p11));
		
		String p12 = "[^a-2]";							// 소문자를 제외하고, 대문자 숫자 모두 true
		
		String p13 = "d[^o]+g";							// d로 시작하고, g로 끝나는 단어중에 o를 제외한
		System.out.println("dog".matches(p13));			// false
		System.out.println("dag".matches(p13));			// true
		System.out.println("dabcdefg".matches(p13));	// true
		
		// <<수량>>
		// + : 1개 이상
		// * : 0개 이상
		// ? : 0개 또는 1개 (아예 없거나 1개)
		// {n} : n개
		// {n,} : n개 이상
		// {n, m} : n개 이상 m개 이하
		
		String p14 = "do+g";							// d로 시작하고, o가 1개 이상, g로 끝나는
		System.out.println("dog".matches(p14));
		System.out.println("dooooooooog".matches(p14));
		
		String p15 = "do*g";
		System.out.println("dog".matches(p15));
		System.out.println("doooog".matches(p15));
		System.out.println("dg".matches(p15));
		
		String p16 = "do?g";
		System.out.println("dog".matches(p16));// true
		System.out.println("dg".matches(p16));// true
		System.out.println("doog".matches(p16));// false
		
		String p17 = "do{2}g";
		System.out.println("doog".matches(p17));
		System.out.println("dog".matches(p17));
		System.out.println("dooog".matches(p17));
		
		// <<기호>>
		// . : 모든 글자
		// \d: [0-9]				(digit)
		// \w: [a-zA-z0-9_]			(word character)
		// \s: 공백(스페이스, 엔터, 탭)
		// ^ : 한 줄의 시작
		// $ : 한 줄의 끝
		
		String p18 = ".";
		System.out.println("a".matches(p18));
		System.out.println(" ".matches(p18));
		System.out.println("0".matches(p18));
		System.out.println("".matches(p18));
		System.out.println("aa".matches(p18));
		System.out.println("aa".matches(".{2}"));
		
		String p19 = "\\d"; // java에서 \는 \\로 작성
		System.out.println("0".matches(p19));
		System.out.println("5".matches(p19));
		System.out.println("a".matches(p19));
		System.out.println("".matches(p19));
		System.out.println("91".matches(p19));
		
		String p20 = "\\d{8}";
		System.out.println("19550101".matches(p20));
		System.out.println("550101".matches(p20));
		
		String p21 = "\\d{4}-?\\d{2}-?\\d{2}";
		System.out.println("19550101".matches(p21));
		System.out.println("1955-01-01".matches(p21));
		System.out.println("195501-01".matches(p21));
		
		// () : 그룹
		// | : or 또는
		
		String p22 = "(dog|cat)";
		System.out.println("dog".matches(p22));
		System.out.println("cat".matches(p22));
		
		String p23 = "(\\d{4}|\\d{2})-?\\d{2}-?\\d{2}";
		System.out.println("19550101".matches(p23));
		System.out.println("550101".matches(p23));
		System.out.println("9550101".matches(p23));
		System.out.println("1955-01-01".matches(p23));
		System.out.println("55-01-01".matches(p23));
		
		String p24 = "(dog)+";
		System.out.println("dog".matches(p24));
		System.out.println("dogdog".matches(p24));
		System.out.println("dogdo".matches(p24));
		
		// \. : . (dot)
		
		String p25 = "\\.";
		System.out.println("a".matches(p25)); // false
		System.out.println(".".matches(p25)); // true
		
		String p26 = "www\\.[a-z]+\\.com";
		System.out.println("www.daum.com".matches(p26));
		System.out.println("daum.com".matches(p26));
		System.out.println("www.daumcom".matches(p26));
		
	}
}
