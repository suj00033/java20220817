package ch06.book.exercise.p18;

public class ShopService {
	private static ShopService instance = new ShopService();
	
	private ShopService() {}					// 생성자 접근금지
	
	public static ShopService getInstance() {			// 메소드만 공개
//		if (instance == null) {
//			instance = new ShopService();
//  }														// 4번째줄을 다른방식으로 풀어씀
		return instance;
	}
}
