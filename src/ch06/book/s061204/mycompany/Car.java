package ch06.book.s061204.mycompany;

import ch06.book.s061204.hankook.*;      // * 패키지 내에 모든 클래스를 import
import ch06.book.s061204.hyundai.Engine;
import ch06.book.s061204.kumho.*;

public class Car {
	// 필드
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	ch06.book.s061204.hankook.Tire tire3 = new ch06.book.s061204.hankook.Tire();
	ch06.book.s061204.kumho.Tire tire4 = new ch06.book.s061204.kumho.Tire();
}
