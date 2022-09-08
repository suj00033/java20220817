package ch05.book;

import ch05.book.s050701.Week;

public class EnumMethodExample {
	public static void main(String[] args) {
		// name() 메소드
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		// ordinal() 메소드
		int ordinal = today.ordinal();				// 서수, 0번부터 6번까지
		System.out.println(ordinal);
		
		// compareTo() 메소드
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int res1 = day1.compareTo(day2);
		int res2 = day2.compareTo(day1);
		System.out.println(res1);
		System.out.println(res2);
		
		// valueOf() 메소드
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말 이군요.");
			} else {
				System.out.println("평일 이군요");
			}
		}
		
		// values() 메소드
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
	}
}
