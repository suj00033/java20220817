package ch18.lecture.p6filter;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class C08PrintStream {
	public static void main(String[] args) {
		String name = "C:\\Users\\user\\Desktop\\output\\output14.txt";
		
		try {
			FileOutputStream fis = new FileOutputStream(name);
			PrintStream ps = new PrintStream(fis); 				// PrintWriter나 PrintStream 같음
			
			ps.write(97);
			ps.print(97);
			
			ps.println(3.14);
			ps.println("가");
			ps.println(true);
			
			System.out.println("hello world");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
