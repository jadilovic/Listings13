package Primjeri;

import java.util.Date;

public class CompareToPrimjeri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new Integer(3).compareTo(new Integer(5)));
		System.out.println("ABC".compareTo("ABE"));
		Date date1 = new Date(2013, 1, 1);
		Date date2 = new Date(2012, 1, 1);
		System.out.println(date1.compareTo(date2));
	}

}
