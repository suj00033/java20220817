package ch11.lecture.p03string;

public class C05Replace {
	public static void main(String[] args) {
		String s1 = "coyote";
		
		String s2 = s1.replace('o', 'z');	// o자리에 z로 바뀌지만 s1이 바뀐 것은 아니다
		System.out.println(s1);
		System.out.println(s2);
		
		String s3 = "hashcode is code of";
		String s4 = s3.replace("code", "KODE");
		System.out.println(s3);
		System.out.println(s4);
	}
}
