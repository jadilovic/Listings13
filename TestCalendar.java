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
	}

}
