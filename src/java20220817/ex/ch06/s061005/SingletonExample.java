package java20220817.ex.ch06.s061005;

public class SingletonExample {
	public static void main(String[] args) {
		/* Singleton obj = new Singleton();
		 * private 으로 new 생성자 방지
		 * 때문에 getInstance 메소드를 이용해
		 * 객체를 반환시킨다 */
		Singleton obj1 = Singleton.getIstance();
		Singleton obj2 = Singleton.getIstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	}
}
