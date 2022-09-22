package ch18.book.exercise.p11;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClinetExample {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost", 5001);		// localhost는 자기자신컴퓨터를 말함, 랜선안타고 바로 옴
		OutputStream os = socket.getOutputStream();
		
		String filePath = 
				"C:\\Users\\user\\Desktop\\output\\pen.jpg";
		File file = new File(filePath);
		
		String fileName = file.getName();
		byte[] b = new byte[100];
		fileName.getBytes(0, fileName.length(), b, 0);
		os.write(b);
			
		System.out.println("[파일 보내기 시작] " + fileName);
		FileInputStream fis = new FileInputStream(file);
		
		int len = 0;
		
		while((len = fis.read(b)) != -1) {
			os.write(b, 0, len);
			
		}
		
		os.flush();
		
		fis.close();
		os.close();
		socket.close();
	}
}
