package ch18.lecture.p5writer;

import java.io.FileWriter;
import java.io.Writer;

public class C02Writer {
	public static void main(String[] args) throws Exception {
		String fileName = "C:\\Users\\user\\Desktop\\output\\output6.txt";
		Writer wr = new FileWriter(fileName);
		
		wr.write("hello world"); 				// 여러 문자를 받을수 있는 메소드
		wr.write("!!!!!!!!\n");					// \n : enter
		wr.write("@@@@\t@@@@"); 				// \t : tab(띄어쓰기), 탭키는 하나의 문자로 취급
		
		wr.close();
	}
}
