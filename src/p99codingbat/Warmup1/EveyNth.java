package p99codingbat.Warmup1;

public class EveyNth {
	public String everyNth(String str, int n) {
		  String s = "";
		  for(int i = 0; i<str.length(); i+=n) {
		    char c = str.charAt(i);
		    s += c;
		  }
		  return s;
		}
}
