package ch18.lecture.p6filter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class C07Filter {
	public static void main(String[] args) throws Exception {
		String originalFileName = 
				"C:\\Users\\user\\Desktop\\output\\output12.txt";
		String targetFileName =
				"C:\\Users\\user\\Desktop\\output\\output13.txt";
		
		FileInputStream fis = new FileInputStream(originalFileName);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		FileOutputStream fos = new FileOutputStream(targetFileName);
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
	
		char[] buf = new char[100];       					// p5\\C04Writer 참고
		int len = 0;
		
		while((len= br.read(buf)) != -1) {
			bw.write(buf, 0, len); 
		}
		
		
		br.close();
		bw.close();
		
	}
}
