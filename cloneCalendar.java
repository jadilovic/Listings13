package Primjeri;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class cloneCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cl = new GregorianCalendar(2013, 2, 1);
		Calendar c2 = c1;
		Calendar c3 = (Calendar)c1.clone();
		
		System.out.println("calendar == calendar1 is " + (c1 == c2));
		System.out.println("calendar == calendar2 is " + (c1 == c3));
		System.out.println("calendar.equals(calendar2) is " + c1.equals(c3));
	}

}
