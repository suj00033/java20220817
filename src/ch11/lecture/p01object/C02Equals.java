package ch11.lecture.p01object;

public class C02Equals {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		
		System.out.println(o1.equals(o2));				// false >>>> 실제 인스턴스 메소드 실행(X)
		System.out.println(o2.equals(o1)); 				// 위에 false가 나오면 반대로 넣어도 결과값이 같아야 한다
		System.out.println(o1.equals(o1)); 				// 자기자신을 대입했을때는 true가 나옴
		
		System.out.println("String equals()");
		
		Object o3 = new String("top"); 
		Object o4 = new String("top"); 
		
		System.out.println(o3.equals(o4)); 				// true >>>> 실제 인스턴스의 메소드가 실행됨(O)
														//           파라미터의 문자열이 같을때 true
		System.out.println(o4.equals(o3)); 				// true
		
		System.out.println("String ==");
		System.out.println(o3 == o4); 					// false
	}
}
