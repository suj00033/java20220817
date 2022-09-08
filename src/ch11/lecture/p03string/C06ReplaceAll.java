package ch11.lecture.p03string;

public class C06ReplaceAll {
	public static void main(String[] args) {
		String s1 = "hashcode is a code of instance";
		String u1 = s1.replace("code", "코드");
		
		System.out.println(u1);
		
		String u2 = s1.replaceAll("code", "코드");
		
		System.out.println(u2);
		
		// replace는 문자열 자체를
		// replaceAll은 패턴을 받는다 (ex. 맨끝에 e가 들어간 단어를 대체하고 싶을때)
		
		String u3 = s1.replaceAll(".{3}.e", "코드");
								//.{3}.e : regular expression(정규표현식).regex 축약형
		System.out.println(u3);
	}
}
