package Primjeri;

import java.util.ArrayList;

public class cloneArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Double> list1 = new ArrayList<>();
		list1.add(1.5);
		list1.add(3.5);
		list1.add(5.5);
		ArrayList<Double> list2 = (ArrayList<Double>) list1.clone();
		ArrayList<Double> list3 = list1;
		
		list2.add(7.5);
		list3.remove(5.5);
		
		System.out.println(list1.toString());
		System.out.println(list2.toString());
		System.out.println(list3.toString());
	}

}
