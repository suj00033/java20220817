package ch18.lecture.p5writer;

import java.io.FileWriter;
import java.io.Writer;

public class C01Writer {
	public static void main(String[] args) throws Exception {
		// Writer : 문자 단위로 출력하는 스트림
		// 주요 메소드 : write
		
		String fileName = "C:\\Users\\user\\Desktop\\output\\output5.txt";
		Writer wr = new FileWriter(fileName);
		
		// write(int) : 문자 하나 출력하는 메소드
		wr.write('a');
		wr.write('b');
		wr.write('한');						// 한글은 3바이트로 쓰임을 추측가능(자바에서는 2바이트, 파일에서는 3바이트)
		wr.write(9742);
		
		
		
		wr.close();
		
	}
}
