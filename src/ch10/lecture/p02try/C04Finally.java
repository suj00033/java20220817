package ch10.lecture.p02try;

public class C04Finally {
	public static void main(String[] args) {
		try {
			System.out.println("코드");
		} finally {										// catch 없이 바로 finally로 가능
			System.out.println("항상 실행되는 코드");
			System.out.println("캐치 없이 사용가능");
			System.out.println("캐피 블럭 있으면 그 다음(마지막)에 작성");
		}
	}
}
