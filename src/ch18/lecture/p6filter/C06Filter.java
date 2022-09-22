package ch18.lecture.p6filter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class C06Filter {
	public static void main(String[] args) throws Exception {
		String name = "C:\\Users\\user\\Desktop\\output\\output12.txt";
		
		try (
		FileInputStream fis = new FileInputStream(name);		// FileInputStream이나 InputStream 같음
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		) {
		String line = null;
		
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
//			fis.close();
//			isr.close();
//			br.close();
		}
		
	}

