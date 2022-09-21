package ch18.lecture.p6filter;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class C02OutputStreamWriter {					// 같은 방향으로 감쌀수 있다
	public static void main(String[] args) throws Exception {
		String name = "C:\\Users\\user\\Desktop\\output\\output10.txt";
		
		FileOutputStream fos = getFileOutputStream(name);
		Writer wr = new OutputStreamWriter(fos);
		
//		fos.write('a');
//		fos.write('b');
//		fos.write('가');	// fos는 바이트 단위, 원하는 한글문자가 안나옴
//		fos.write('나');
		
		wr.write('a');		// 감싸야 한다
		wr.write('b');
		wr.write('가');
		wr.write('나');
		
		wr.close();
		fos.close();
		
		
	}
	
	private static FileOutputStream getFileOutputStream(String fileName) throws Exception {
		return new FileOutputStream(fileName);
	}
}
