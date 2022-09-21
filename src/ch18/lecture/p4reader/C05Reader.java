package ch18.lecture.p4reader;

import java.io.FileReader;

public class C05Reader {
	public static void main(String[] args) throws Exception {
		String fileName = "src/ch18/lecture/p4reader/C03Reader.java";
		FileReader fr = new FileReader(fileName);
		
		char[] buffer = new char[100];
		int len = 0;
		int cnt = 0;
		while ((len = fr.read(buffer)) != -1) {
			cnt++;
		}
		
		System.out.println(cnt + " 번 읽음");
		
		fr.close();
	}
}
