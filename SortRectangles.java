package Primjeri;

import java.util.Arrays;

public class SortRectangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ComparableRectangle[] rectangles = {
				new ComparableRectangle(5, 6),
				new ComparableRectangle(3, 4),
				new ComparableRectangle(7, 8),
				new ComparableRectangle(2, 2)};
		
		Arrays.sort(rectangles);
		ComparableRectangle ncr = new ComparableRectangle(0, 0);
		
		for(ComparableRectangle cr: rectangles){
			cr.setColor("blue");
			cr.setFilled(true);
			cr.setHeight(9);
			System.out.println(cr + " ");
			System.out.println(cr.compareTo(ncr));
			ncr = cr;
		}
		
		Integer n1 = new Integer(3);
		Object n2 = new Integer(4);
		System.out.println(n1.compareTo((Integer) n2));
	}

}
