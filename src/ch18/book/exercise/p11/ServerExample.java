package ch18.book.exercise.p11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerExample {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("localhost", 5001)); //	socket = new Socket("172.30.1.60", 30000);랑 ==
		
		System.out.println("[서버 시작]");
		
		while(true) {
			try {
				Socket socket = serverSocket.accept();
				
				InputStream is = socket.getInputStream();
				
				byte[] bytes = new byte[100];
				int readByteCount = -1;				// 몇개 읽었는지 확인하는 변수 설정
				
				is.read(bytes);
				String fileName = new String(bytes);
				
				fileName = fileName.trim();   // 앞뒤 공백 있으면 삭제해주는 메소드
				
				System.out.println("[파일 받기 시작] " + fileName);
				
				FileOutputStream fos = new FileOutputStream("C:/Temp/" + fileName);
				
				while ((readByteCount = is.read(bytes)) != -1) {
					fos.write(bytes, 0, readByteCount);
				}
				
				System.out.println("[파일 받기 완료]");
				
				fos.close();
				is.close();
				socket.close();
				
			} catch (Exception e) {
				// TODO: handle exception
				break;
			}
		}
		
		serverSocket.close();
		System.out.println("[서버 종료]");
	}
}
