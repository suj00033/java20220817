package java20220817.ex.ch05;

public class EnumMethodExample {
	public static void main(String[] args) {
		// name() 메소드
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);					// 이름 출력
		
		// ordinal() 메소드
		int ordinal = today.ordinal();
		System.out.println(ordinal);				// 열거 객체 순번 개수
		
		// compareTo() 메소드
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int res1 = day1.compareTo(day2);
		int res2 = day2.compareTo(day1);
		System.out.println(res1);					// 수요일을 기준으로 월요일의 상대적 위치 > -2
		System.out.println(res2);					// 월요일을 기준으로 수요일의 상대적 위치 > 2
		
		// valueOf() 메소드
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);	// 
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말 이군요.");
			} else {
				System.out.println("평일 이군요.");
			} 
		}
		
		// values() 메소드
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
	}
}
