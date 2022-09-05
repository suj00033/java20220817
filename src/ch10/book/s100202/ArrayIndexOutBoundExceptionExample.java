package ch10.book.s100202;

public class ArrayIndexOutBoundExceptionExample {
	public static void main(String[] args) {			// void : 리턴값 없다
//		String data1 = args[0];							// Run Configuration에서 실행 매개값 설정가능
//		String data2 = args[1];
//		String data3 = args[2];
//		
//		System.out.println("arg[0]: " + data1);			// 두개의 실행 매개값을 주지않았기 때문에
//		System.out.println("arg[1]: " + data2);			// arg[0], arg[1]과 같이 인덱스를 사용할 수 없다.
//		System.out.println("arg[2]: " + data3);
//		System.out.println(args.length);
		
		if(args.length == 3) {
			String data1 = args[0];	
			String data2 = args[1];	
			String data3 = args[2];	
				
			
			System.out.println("arg[0]: " + data1);
			System.out.println("arg[1]: " + data2);	
			System.out.println("arg[2]: " + data3);
			
		} else {
			System.out.println("[실행 방법]");
			System.out.println("java ArrayIndexOutBoundExceptionExample ");
			System.out.println("값1 값2");
		}
	}
}
