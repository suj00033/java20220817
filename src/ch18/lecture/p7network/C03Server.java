package ch18.lecture.p7network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class C03Server {
	public static void main(String[] args) {
		System.out.println("연결 시도 중....");
		try {
			ServerSocket serverSocket = new ServerSocket(30000);
			Socket socket = serverSocket.accept();
			
			System.out.println("연결 완료");
			
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);	 // 문자 단위로 읽고싶다
			BufferedReader br = new BufferedReader(isr); // 효율적으로 읽고싶다
			
			try(is;isr;br;) {
				
				String line = "";
				String from = socket.getRemoteSocketAddress().toString();
				
				while ((line = br.readLine()) != null) {
					System.out.println(from + "에게서 받은 메세지: " + line);
				}
			}
			
			System.out.println("프로그램 종료");
			
		} catch (Exception e) { 
			// TODO: handle exception
			e.printStackTrace();
		}
		
		// 여러번 요청받는 코드
//		System.out.println("연결 시도 중...");
//		try (ServerSocket serverSocket = new ServerSocket(60000);) {
//			int cnt = 0;
//			while (cnt < 50) {
//				cnt++;
//				Socket socket = serverSocket.accept();
//				System.out.println("연결 완료");
//
//				Thread thread = new Thread(() -> {
//					try (InputStream is = socket.getInputStream();
//							InputStreamReader isr = new InputStreamReader(is);
//							BufferedReader br = new BufferedReader(isr);) {
//
//						String line = "";
//						String from = socket.getRemoteSocketAddress().toString();
//						while ((line = br.readLine()) != null) {
//							System.out.println(from + "에서 받은메세지:" + line);
//						}
//					} catch (Exception e) {
//						e.printStackTrace();
//					}
//
//				});
//				thread.start();
//
//			}
//
//			System.out.println("프로그램 종료");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}		
		
		
	
	}
}
