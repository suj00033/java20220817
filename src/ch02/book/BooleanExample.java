package ch02.book;

public class BooleanExample {
	public static void main(String[] args) {
		boolean stop = true; //false일 경우에는 미실행
		if(stop) {
			System.out.println("중지합니다.");
		} else { 			//false일 경우에는 미실행
			System.out.println("시작합니다.");
		}
	}
}
