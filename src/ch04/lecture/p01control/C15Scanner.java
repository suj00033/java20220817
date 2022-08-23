package ch04.lecture.p01control;

import java.util.Scanner; 							// Scanner를 사용하기 위해 삽입

public class C15Scanner {
	public static void main(String[] args) {
		String src = "hello my java"; 				// 단어마다 토큰 끊어내기
		Scanner scanner = new Scanner(src);

		String t1 = scanner.next(); 				// 첫번째 토큰
		System.out.println(t1);		

		String t2 = scanner.next(); 				// 두번째 토큰
		System.out.println(t2);

		String t3 = scanner.next(); 				// 세번째 토큰
		System.out.println(t3);

		String src2 = "123 456 789";
		scanner = new Scanner(src2);

		String t4 = scanner.next(); 				// "123 456 789" 스캔
		System.out.println(t4);

		int i1 = Integer.valueOf(t4); 				// t4를 int로 강제변환
		System.out.println(i1);

		System.out.println(i1 * 2); 				// System.out.println(t4*2);는 안됨

		int i2 = scanner.nextInt(); 				// nextInt로 int 변환가능
		System.out.println(i2);

		String src3 = "hello world\nhello java\nhello spring"; 					// \n : new line
		System.out.println(src3);
		
		scanner = new Scanner (src3);
		
		String line1 = scanner.nextLine();			// 변수 line1 할당
		System.out.println(line1);
		
		System.out.println("사용자 입력 받기");
		scanner = new Scanner(System.in);			// in : 키보드, 입력을 받는곳
		
		String input1 = scanner.next();				// 입력받을 준비를 받고있음 프로그램 종료 아직 x
		
		System.out.println("입력한 첫번째 토큰 : " + input1); 		// 콘솔창에 입력한 문자 출력
		
		int input2 = scanner.nextInt();
		
		System.out.println("입력한 두번째 토큰 : " + input2); 	// int형식 문자를 받아야만 출력됨
															// 정수까지 nextInt()가 읽히고 엔터가 입력된 상태
		
		
		scanner.nextLine();							// 사용자 입력으로 엔터가 들어갔기에 한번더 정의해줘야함
		String input3 = scanner.nextLine();			// 정의를 안해주면 nextInt()에서 프로그램 실행이 종료됨
		System.out.println("입력한 한줄 : " + input3);
		}
}
