package p99codingbat.Array1;

public class String1FirstTwo {
	public String firstTwo(String str) {
		  int a = str.length();
		  if(a < 2) {
		    return str;
		  } else {
		    return str.substring(0, 2);
		  }
		}
	
	// if (str.length() > 2) {
	// return str.subctring(0. 2);
	//	}
	// return str;
}
