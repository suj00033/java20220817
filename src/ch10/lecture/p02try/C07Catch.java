package ch10.lecture.p02try;

public class C07Catch {
	public static void main(String[] args) {
		// catch 블럭은 순서가 상관있음
		
		String[] arr = {"삼백"};
		
		try {
			int a = Integer.parseInt(arr[0]);
			
			System.out.println(a);
		
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("잘못된 인덱스!!!");
		} catch(NumberFormatException e) {
			System.out.println("잘못된 형식@@@@");
		}
			
//		} catch(Exception e) {								// 여러 catch블럭 작성시 
//			System.out.println("잘못된 형식@@@@");			// 상위 타입을 catch 블럭을 먼저 쓸수 없음
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("잘못된 인덱스!!!");
//		}
	}
}
