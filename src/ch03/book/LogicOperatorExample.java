package ch03.book;

public class LogicOperatorExample {
	public static void main(String[] args) {
		int charCode = 'A';						// 자동 형변환, 65
		
		if( (charCode>=65) & (charCode<=90) ) {	// true && true
			System.out.println("대문자 이군요");
		}
		
		if( (charCode>=97) && (charCode<=122) ) { // false && true
			System.out.println("소문자 이군요");
		}
		
		if( !(charCode<48) && !(charCode>57) ) {  // true && false 
			System.out.println("0~9 숫자 이군요");
		}
		
		int value = 6;
		
		if( (value%2==0) | (value%3==0) ) {		  // true | true
			System.out.println("2 또는 3의 배수 이군요");
		}
		
		if( (value%2==0) || (value%3==0) ) {	  // true || true
			System.out.println("2 또는 3의 배수 이군요");
		}
	}
}
