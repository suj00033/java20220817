package ch18.lecture.p6filter;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class C05Filter {
	public static void main(String[] args) throws Exception {
		String name = "C:\\Users\\user\\Desktop\\output\\output12.txt";
		OutputStream os = new FileOutputStream(name);		  // os가
		OutputStreamWriter osw = new OutputStreamWriter(os);  // osw를 감싸고
		BufferedWriter bw = new BufferedWriter(osw);		  // osw가 bw를 감싸고, 효율적으로 읽게하는buffered
		
		for(int i=0; i<100000; i++)	{
			bw.write("오징어게임");
			bw.write("\n");
		}
		
		bw.close();
		osw.close();
		os.close();
	}
}
