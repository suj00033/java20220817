package ch10.lecture.p02try;

public class C08MultiCatch {
	public static void main(String[] args) {
		String[] arr = {"삼백"};
		
		try {
			int a = Integer.parseInt(arr[0]);
			
			System.out.println(a);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 발생!!!");
		} catch (NumberFormatException e) {
			System.out.println("예외 발생!!!!");
		}
		
		try {
			int a = Integer.parseInt(arr[0]);
			
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			// 한줄로도 압축해서 작성 가능
		}
	}
}
