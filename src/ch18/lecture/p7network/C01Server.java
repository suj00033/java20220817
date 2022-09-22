package ch18.lecture.p7network;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

public class C01Server {
	public static void main(String[] args) {
		// 서버 : 연결을 기다림
		// 연경 요청을 수락함
		// Socket 만들기
		// ServerSocket 사용
		
		try (
		// ServerSocket 만듦
		ServerSocket serverSocket = new ServerSocket(60000);
		
		// 연결 기다림
	
		Socket socket = serverSocket.accept();) {
			
			System.out.println(socket.getRemoteSocketAddress());
			
			System.out.println("연결 종료");
			
		} catch(Exception e) {
			e.printStackTrace();
			

			// 여러명 연결요청 받는 코드
//			System.out.println("연결 기다림");
//			// 172.30.1.60:60000
//			try (
//					// ServerSocket 만듦
//					ServerSocket serverSocket = new ServerSocket(60000);) {
//				
//				AtomicInteger cnt = new AtomicInteger();
//				while (cnt.get() < 50) {
//					// 연결 기다림
//					Socket socket = serverSocket.accept();
//					cnt.incrementAndGet();
//					
//					Thread thread = new Thread(() -> {
//						System.out.println(socket.getRemoteSocketAddress());
//						
//						System.out.println("연결 종료");
//					});
//					thread.start();
//					
//				}
//
//			} catch (Exception e) {
//				e.printStackTrace();
	
		}
	}
}
