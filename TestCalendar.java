package Primjeri;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = new GregorianCalendar();
		System.out.println("Current time is: " + new Date());
		System.out.println("Current year is: " + calendar.get(Calendar.YEAR));
		System.out.println("Current month is: " + calendar.get(Calendar.MONTH));
		System.out.println("Current week is " + calendar.get(Calendar.WEEK_OF_YEAR));
		System.out.println("Crrent day of the month is: " + calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("Naziv dana u sedmici: " + calendar.get(Calendar.WEDNESDAY));
		System.out.println("Current day of the week " + calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println("Current hour of the day" + calendar.get(Calendar.HOUR) + " hour: " + calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("AM or PM: " + calendar.get(Calendar.AM_PM));
		System.out.println("Day in the year: " + calendar.get(Calendar.DAY_OF_YEAR));
		System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
		System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
		System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));
		System.out.println("WEEK_OF_MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH));
		System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
		
		Calendar calendar1 = new GregorianCalendar(2001, 8, 11);
		String[] dayOfWeek = {"Sunday", "Monday", "Tuesday", "Wendsday", "Thursday", "Friday", "Saturday"};
		System.out.println("Day of the week on September 11, 2001 is " + dayOfWeek[calendar1.get(Calendar.DAY_OF_WEEK)-1]);
		System.out.println("Datum calendar1 is " + calendar1.get(Calendar.DAY_OF_MONTH) + ", " + calendar1.get(Calendar.MONTH) + ", " + calendar1.get(Calendar.YEAR));
		calendar1.set(Calendar.DAY_OF_MONTH, 1);
		System.out.println("Prvi dan u mjesecu: " + calendar1.get(Calendar.DAY_OF_MONTH));
		calendar1.add(Calendar.DAY_OF_MONTH, 5);
		System.out.println("Plus pet dana " + calendar1.get(Calendar.DAY_OF_MONTH));
		calendar1.add(Calendar.DAY_OF_MONTH, -10);
		System.out.println("Minus deset dana " + calendar1.get(Calendar.DAY_OF_MONTH));
		System.out.println("Broj dana u mjesecu: " + calendar1.getActualMaximum(Calendar.DAY_OF_MONTH));
		Date date = new Date();
		System.out.println("Current time is: " + date);
		calendar1.setTime(date);
		System.out.println("Current time is: " + calendar1.getTime());
	}

}
