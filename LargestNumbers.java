package Primjeri;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class LargestNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Number> list = new ArrayList<>();
		list.add(45);
		list.add(33.8456);
		list.add(new BigInteger("885858585858558858585"));
		list.add(new BigDecimal("3.4848484848484848484"));
		
		System.out.println("The largest number is: " + getLargestNumber(list));
		
		Number x = 3;
		System.out.println(x.intValue());
		System.out.println(x.doubleValue());
		
		Number x2 = new Integer(3);
		System.out.println(x2.intValue());
		System.out.println(((Integer) x2).compareTo(new Integer(4)));
	}

	private static Number getLargestNumber(ArrayList<Number> list) {
		if(list == null || list.size() == 0)
		return null;
		Number number = list.get(0);
		for(int i = 1; i < list.size(); i++){
			if(number.doubleValue() < list.get(i).doubleValue())
				number = list.get(i);
		}
		return number;
	}
}
