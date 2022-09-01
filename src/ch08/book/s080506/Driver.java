package ch08.book.s080506;

import ch08.book.s080505.Bus;
import ch08.book.s080505.Vehicle;

public class Driver {
	public void drive(Vehicle vehicle) {		// Bus객체 || Taxi 객체
		if(vehicle instanceof Bus) {			// Vehicle 매개 변수가 참조하는 객체가 Bus인지 조사
			Bus bus = (Bus) vehicle;			// Bus객체일 경우 안전하게 강제타입변환시킴
			bus.checkFare();
		}
		vehicle.run();
	}
}
