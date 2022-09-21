package ch18.lecture.p3exception;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class C03Exception {
	public static void main(String[] args) {
		// try - with - resources 구문 (java 7부터 가능)
		// try - with - resources 와 사용 가능한 type은
		// AutoCloseable 이여야 한다
		
		try (
			// 여기 선언된 자원은 자동으로 닫아줌
			OutputStream os = new FileOutputStream("");			// InputStream, OutputStream은 AutoCloseable 타입이다
			InputStream is = new FileInputStream("");
				) {
			// 읽고 쓰는 작업
//			os = new FileOutputStream("");       // 다시 할당할수 없음
			os.write(3);
			is.read();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
