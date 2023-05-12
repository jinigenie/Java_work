package day13.api.util.date;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		
		// static 메소드를 사용하여 객체를 반환하는 모형
		Calendar cal = Calendar.getInstance();
	
		System.out.println(Calendar.YEAR);
		System.out.println(Calendar.MONTH);
		System.out.println(Calendar.DATE);
		
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = cal.get(Calendar.MONTH);
		System.out.println(month + 1);

		int day = cal.get(Calendar.DATE);
		System.out.println(day);
		
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		System.out.println(hour + ":" + min + ":" + sec);
		
		
	}
	
	
	
}
