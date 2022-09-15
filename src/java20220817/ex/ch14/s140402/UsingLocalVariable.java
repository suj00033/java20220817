package java20220817.ex.ch14.s140402;

public class UsingLocalVariable {
	void method(int arg) {
		int localVar = 40;
		
//		arg = 31;								final 특성으로 수정 불가
//		localVar = 41;	 						final 특성으로 수정 불가
		
		MyFunctionInterface fi = () -> {
			System.out.println("arg: " + arg);
			System.out.println("localVar: " + localVar + "\n");
		};
		fi.method();
	}
}
