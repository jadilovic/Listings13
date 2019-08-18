package Primjeri;

import java.util.Arrays;

public class testPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person[] persons = {new Person(6), new Person(4), new Person(2)};
		Arrays.sort(persons);
		for(Person p: persons)
			System.out.print(p.getID() + ", ");
	}

}
