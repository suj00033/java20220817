package ch06.book.s061102;

public class Earth {
	static final double EARTH_RADIUS = 6400;				// 상수 선언 방식
	static final double EARTH_SURFACE_AREA;
	
	static {											// 복잡한 식은 정적 블록을 통해 초기화 가능
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}
