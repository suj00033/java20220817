package p99codingbat.Warmup1;

public class Frontback {
	public String frontBack(String str) {
		if (str.length() <= 1) {
			return str;						// 문자열 길이가 1과 같거나 작으면 그대로 문자열 출력
		}
		
		String mid = str.substring(0, str.length()-1);		// 문자열 중간
		return str.charAt(str.length()-1) + mid + str.charAt(0);	// 문자열 끝글자+문자열 중간+문자열 첫글자
	}
}
