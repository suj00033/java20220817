package p99codingbat.Warmup1;

public class StringE {
	public boolean stringE(String str) {
		return str.matches("[^e]*e[^e]*e?[^e]*e?[^e]*");
	}
}

//int cnt = 0;

		// for (int i = 0; i < str.length(); i++) {
		// if (str.charAt(i) == 'e') {
		// cnt++;
		// }
		// }

		// return cnt >= 1 && cnt <= 3;