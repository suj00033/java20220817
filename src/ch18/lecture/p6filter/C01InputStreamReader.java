//한글
package ch18.lecture.p6filter;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class C01InputStreamReader {
	public static void main(String[] args) throws Exception {
		String name = "src/ch18/lecture/p6filter/C01InputStreamReader.java";
		
		FileInputStream fis = getFileInputStream(name);
		Reader rd = new InputStreamReader(fis);				// xxxReader : Reader를 상속받음
		 													// fis(파일)을 감싼 , 다른 스트림을 감쌀수 있다			
//		int c1 = fis.read();
//		int c2 = fis.read();
//		int c3 = fis.read();
		
		int c1 = rd.read();									// 문자
		int c2 = rd.read();
		int c3 = rd.read();
		
		System.out.println((char) c1);
		System.out.println((char) c2);
		System.out.println((char) c3);
	}
	
	private static FileInputStream getFileInputStream(String fileName) throws Exception {
		return new FileInputStream(fileName);
	}
}
