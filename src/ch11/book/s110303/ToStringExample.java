package ch11.book.s110303;

import java.util.Date;

public class ToStringExample {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();						// 현재 시스템의 날짜와 시간 정보를 리턴
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
	}
}
