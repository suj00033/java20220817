package ch18.lecture.p1inputStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class C01InputStream {
	public static void main(String[] args) throws Exception {
		// InputStream : 프로그램 기준으로 입력받는 객체를 만드는 클래스
		// 입력 단위 : byte
		
		String path = "src/ch18/lecture/p1inputStream/C01InputStream.java";	// 파일 경로 설정(파일 경로 설정을 잘해야한다)
		InputStream is = new FileInputStream(path);
		
		// 주요 메소드 read
		// read() : 한 바이트 읽고 리턴(int형: 4바이트가 1바이트로)
		int r1 = is.read();
		int r2 = is.read();
		int r3 = is.read();
		
		System.out.println(r1);			// p 아스키 코드
		System.out.println(r2);			// a
		System.out.println(r3);			// c
		
		is.close();				// 자원 사용 후 닫기(반드시)
	}
}
