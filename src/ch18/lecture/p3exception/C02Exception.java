package ch18.lecture.p3exception;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C02Exception {
	public static void main(String[] args) {
		OutputStream os = null;
		
		try {
			
			String name = "C:\\Users\\user\\Desktop\\output\\output5.txt";
			os = new FileOutputStream(name);				// 이곳에서 선언된 변수는 try블록에서만 사용가능
			os.write(99);  		
			os.write(88);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			// 꼭 실행해야하는 코드는 finally 블럭에 작성
			try {
				
				if(os != null) {
					os.close();			
					
				}
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();							// 너무 많은 코드가 소비된다
			}
		
		}
	}
}
