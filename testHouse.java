package Primjeri;

import java.util.ArrayList;

public class testHouse {

	public static void main(String[] args) throws CloneNotSupportedException {
		House h1 = new House(1, 80.9);
		House h2 = (House)h1.clone();
		
		System.out.println(h1 == h2);
		System.out.println(h1.equals(h2));
		System.out.println(h1.getWhenBuilt() == h2.getWhenBuilt());
		
		System.out.println();
		java.util.Date date = new java.util.Date();
		java.util.Date date1 = date;
		java.util.Date date2 = (java.util.Date)(date.clone());
		System.out.println(date == date1);
		System.out.println(date == date2);
		System.out.println(date.equals(date2));
		
		System.out.println();
		ArrayList<String> list = new ArrayList<>();
		list.add("New York");
		ArrayList<String> list1 = list;
		ArrayList<String> list2 = (ArrayList<String>)(list.clone());
		list.add("Atlanta");
		System.out.println(list == list1);
		System.out.println(list == list2);
		System.out.println("list is " + list);
		System.out.println("list1 is " + list1);
		System.out.println("list2.get(0) is " + list2.get(0));
		System.out.println("list2.size() is " + list2.size());
		
		GeometricObject x = new Circle(3);
		GeometricObject y = (GeometricObject) x.clone();
		System.out.println(x == y);
	}

}
